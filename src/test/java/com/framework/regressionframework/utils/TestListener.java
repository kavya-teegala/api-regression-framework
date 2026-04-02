package com.framework.regressionframework.utils;

import com.framework.regressionframework.model.TestResult;
import com.framework.regressionframework.repository.TestResultRepository;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import java.time.LocalDateTime;

public class TestListener implements ITestListener {

    private TestResultRepository repository;

    @Override
    public void onStart(ITestContext context) {

        try {
            if (base.BaseTest.context == null) {
                base.BaseTest.context = org.springframework.boot.SpringApplication.run(
                        com.framework.regressionframework.RegressionFrameworkApplication.class
                );
                System.out.println("Spring Boot Started from Listener");
            }

            repository = base.BaseTest.context.getBean(TestResultRepository.class);

        } catch (Exception e) {
            System.out.println("Error initializing Spring Context");
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        saveResult(result, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        try {
            Object currentClass = result.getInstance();

            java.lang.reflect.Field field = result.getTestClass()
                    .getRealClass()
                    .getDeclaredField("driver");

            field.setAccessible(true);

            WebDriver driver = (WebDriver) field.get(currentClass);

            if (driver != null) {
                Thread.sleep(1000);
                ScreenshotUtil.capture(driver, result.getName());
            } else {
                System.out.println("Driver is NULL, screenshot skipped");
            }

            System.out.println("Test Failed: " + result.getName());

            saveResult(result, "FAIL");

        } catch (Exception e) {
            System.out.println("Error in failure handling");
            e.printStackTrace();
        }
    }

    private void saveResult(ITestResult result, String status) {

        try {
            if (repository == null) {
                System.out.println("Repository is NULL, skipping DB save");
                return;
            }

            System.out.println("Saving to DB...");

            TestResult tr = new TestResult();
            tr.setTestName(result.getName());
            tr.setStatus(status);

            long time = result.getEndMillis() - result.getStartMillis();
            tr.setExecutionTime(String.valueOf(time));

            tr.setTimestamp(LocalDateTime.now().toString());

            repository.save(tr);

            System.out.println("Saved to DB successfully!");

        } catch (Exception e) {
            System.out.println("Error saving to DB");
            e.printStackTrace();
        }
    }
}
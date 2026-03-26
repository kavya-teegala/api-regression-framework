package com.framework.regressionframework.utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            Object currentClass = result.getInstance();

            java.lang.reflect.Field field = result.getTestClass()
                    .getRealClass()
                    .getDeclaredField("driver");

            field.setAccessible(true);

            WebDriver driver = (WebDriver) field.get(currentClass);

            Thread.sleep(1000);

            ScreenshotUtil.capture(driver, result.getName());

            System.out.println("Test Failed: " + result.getName());
            System.out.println("Listener triggered");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
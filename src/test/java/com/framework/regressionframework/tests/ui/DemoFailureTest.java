package com.framework.regressionframework.tests.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoFailureTest {

    WebDriver driver;

    @Test
    public void demoFailureTest() throws InterruptedException {

        System.out.println("Running failure test...");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(3000);

        Assert.assertTrue(false);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
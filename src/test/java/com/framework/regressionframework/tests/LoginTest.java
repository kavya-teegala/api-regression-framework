package com.framework.regressionframework.tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.framework.regressionframework.utils.TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws Exception {
        try {
            driver.get("https://www.google.com");
            driver.findElement(By.name("q")).sendKeys("Automation Test");

            Thread.sleep(3000);

            System.out.println("Login Test Executed");

        } catch (Exception e) {
            com.framework.regressionframework.utils.ScreenshotUtil.capture(driver, "LoginTest_Failure");
            throw e;
        }
    }
}
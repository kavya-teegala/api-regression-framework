package com.framework.regressionframework.tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.framework.regressionframework.utils.TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        driver.get("https://example.com");

        System.out.println("Login Test Executed");
    }
}
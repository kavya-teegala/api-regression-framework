package com.framework.regressionframework.tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){

        driver.get("https://example.com");

        System.out.println("Login Test Executed");
    }
}
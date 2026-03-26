package com.framework.regressionframework.tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchProduct(){

        driver.get("https://example.com");

        System.out.println("Search test executed");

    }
    }
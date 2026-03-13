package com.framework.regressionframework.tests;

import com.framework.regressionframework.base.BaseTest;
import com.framework.regressionframework.utils.DBUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchProduct(){

        driver.get("https://example.com");

        System.out.println("Search test executed");

    }
    }
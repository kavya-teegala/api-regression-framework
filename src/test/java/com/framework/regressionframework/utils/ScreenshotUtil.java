package com.framework.regressionframework.utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import io.qameta.allure.Allure;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String name) {
        try {
            File folder = new File("screenshots");
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/" + name + "_" + timestamp + ".png");

            FileUtils.copyFile(src, dest);


            FileInputStream fis = new FileInputStream(dest);
            Allure.addAttachment(name, fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
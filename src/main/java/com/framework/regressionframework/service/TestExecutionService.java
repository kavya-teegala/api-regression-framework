package com.framework.regressionframework.service;

import org.springframework.stereotype.Service;

@Service
public class TestExecutionService {

    public void runTests() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("cmd.exe", "/c", "mvn clean test");
            processBuilder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
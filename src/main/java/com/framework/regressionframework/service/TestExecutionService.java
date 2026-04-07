package com.framework.regressionframework.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestExecutionService {
    private static final Logger log = LoggerFactory.getLogger(TestExecutionService.class);
    public void runTests() {
        try {
            log.info("Executing tests using Maven...");
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("cmd.exe", "/c", "mvn clean test");
            processBuilder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
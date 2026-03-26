package com.framework.regressionframework.scheduler;

import com.framework.regressionframework.service.TestExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Autowired
    private TestExecutionService executionService;

    @Scheduled(cron = "0 0/2 * * * ?")  // every 2 minutes
    public void runScheduledTests() {
        executionService.runTests();
        System.out.println("Scheduled Test Execution Triggered");
    }
}
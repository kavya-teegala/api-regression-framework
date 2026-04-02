package com.framework.regressionframework.scheduler;
import com.framework.regressionframework.service.TestExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TestScheduler {

    private static final Logger log = LoggerFactory.getLogger(TestScheduler.class);

    @Autowired
    private TestExecutionService executionService;

    @Scheduled(cron = "0 0/2 * * * ?")
    public void runScheduledTests() {
        executionService.runTests();
        log.info("Scheduled test execution triggered");
    }
}
package com.framework.regressionframework.controller;

import com.framework.regressionframework.service.TestExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/execution")
public class ExecutionController {

    @Autowired
    private TestExecutionService executionService;

    @PostMapping("/run")
    public String runTests() {
        executionService.runTests();
        return "Test Execution Started Successfully";
    }
}
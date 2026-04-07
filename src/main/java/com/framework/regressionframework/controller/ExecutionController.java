package com.framework.regressionframework.controller;

import com.framework.regressionframework.model.TestResult;
import com.framework.regressionframework.repository.TestResultRepository;
import com.framework.regressionframework.service.TestExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/execution")
@CrossOrigin(origins = "*")
public class ExecutionController {

    @Autowired
    private TestExecutionService executionService;

    @Autowired
    private TestResultRepository repository;

    // Run tests
    @PostMapping("/run")
    public String runTests() {
        executionService.runTests();
        return "Test Execution Started Successfully";
    }

    // Get all results
    @GetMapping("/results")
    public List<TestResult> getAllResults() {
        return repository.findAll();
    }

    // Get summary
    @GetMapping("/results/summary")
    public Map<String, Long> getSummary() {
        List<TestResult> results = repository.findAll();

        long pass = results.stream()
                .filter(r -> "PASS".equals(r.getStatus()))
                .count();

        long fail = results.stream()
                .filter(r -> "FAIL".equals(r.getStatus()))
                .count();

        Map<String, Long> map = new HashMap<>();
        map.put("PASS", pass);
        map.put("FAIL", fail);
        map.put("TOTAL", (long) results.size());

        long total = results.size() == 0 ? 1 : results.size();

        map.put("PASS_PERCENT", (pass * 100) / total);
        map.put("FAIL_PERCENT", (fail * 100) / total);

        return map;
    }
    @GetMapping("/status")
    public String getExecutionStatus() {
        return "Execution completed successfully";
    }
}
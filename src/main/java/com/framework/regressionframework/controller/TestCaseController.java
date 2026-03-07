package com.framework.regressionframework.controller;

import com.framework.regressionframework.model.TestCase;
import com.framework.regressionframework.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testcases")
public class TestCaseController {

    @Autowired
    private TestCaseService testCaseService;

    @PostMapping
    public TestCase createTestCase(@RequestBody TestCase testCase) {
        return testCaseService.saveTestCase(testCase);
    }

    @GetMapping
    public List<TestCase> getAllTestCases() {
        return testCaseService.getAllTestCases();
    }

    @GetMapping("/{id}")
    public TestCase getTestCaseById(@PathVariable Long id) {
        return testCaseService.getTestCaseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTestCase(@PathVariable Long id) {
        testCaseService.deleteTestCase(id);
    }

    @GetMapping("/add")
    public String addSampleTestCase() {
        TestCase testCase = new TestCase("Login Test", "Auth", "PASS", "3s");
        testCaseService.saveTestCase(testCase);
        return "Test case added!";
    }
    @PutMapping("/{id}")
    public TestCase updateTestCase(@PathVariable Long id,
                                   @RequestBody TestCase updatedTestCase) {

        TestCase existing = testCaseService.getTestCaseById(id);

        if (existing != null) {
            existing.setTestName(updatedTestCase.getTestName());
            existing.setModuleName(updatedTestCase.getModuleName());
            existing.setStatus(updatedTestCase.getStatus());
            existing.setExecutionTime(updatedTestCase.getExecutionTime());

            return testCaseService.saveTestCase(existing);
        }

        return null;
    }
}
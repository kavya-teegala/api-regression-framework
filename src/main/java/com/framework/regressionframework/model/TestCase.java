package com.framework.regressionframework.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "test_cases")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testName;
    private String moduleName;
    private String status;
    private String executionTime;
    public TestCase(String testName, String moduleName, String status, String executionTime) {
        this.testName = testName;
        this.moduleName = moduleName;
        this.status = status;
        this.executionTime = executionTime;
    }
}
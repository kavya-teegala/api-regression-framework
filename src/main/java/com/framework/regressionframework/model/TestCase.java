package com.framework.regressionframework.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "test_case")
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String testName;
    @Setter
    private String moduleName;
    @Setter
    private String status;
    @Setter
    private String executionTime;

    // Default constructor
    public TestCase() {
    }

    public TestCase(String loginTest, String auth, String pass, String s) {
    }
}

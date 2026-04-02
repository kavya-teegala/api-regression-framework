# Automated Regression Testing Framework

---

##  Project Overview

The **Automated Regression Testing Framework** is designed to efficiently execute, manage, and analyze regression test cases for web applications.

It integrates **Selenium** for UI automation, **TestNG** for test execution, **Spring Boot** for RESTful APIs, and **MySQL** for persistent storage of test results.

The framework supports **parallel execution**, **automated scheduling**, and **detailed reporting**, making it scalable and suitable for real-world testing environments.

---

##  Objectives

* Automate regression testing for web applications
* Reduce manual testing effort
* Improve execution speed using parallel testing
* Store and analyze test results
* Provide APIs for test management
* Generate detailed reports for debugging

---

##  Tech Stack

* **Java** – Core programming language
* **Selenium WebDriver** – UI automation
* **TestNG** – Test execution & parallel testing
* **Spring Boot** – REST API development
* **Spring Data JPA** – Database interaction
* **MySQL** – Data storage
* **Allure Reports** – Test reporting
* **REST Assured** – API testing
* **Maven** – Build and dependency management

---

##  Architecture Overview

The framework follows a layered architecture:

* **Controller Layer** → Handles API requests
* **Service Layer** → Business logic and execution
* **Repository Layer** → Database operations (JPA)
* **Model Layer** → Entity classes
* **Scheduler** → Automated test execution

---

##  Key Features

###  Test Execution

* Automated UI testing using Selenium
* Test execution using TestNG

###  Parallel Execution

* Multiple test cases executed simultaneously
* Reduces overall execution time

### Reporting

* Allure reports with detailed insights
* Pass/Fail status visualization
* Screenshot capture on failure

### Database Integration

* Stores test results in MySQL
* Tracks execution history

### REST APIs

* Fetch test results
* Get execution summary
* Manage test data

### Scheduling

* Automated test execution using Spring Boot Scheduler

---

##  Project Structure

```
src/main/java/com/framework/regressionframework
│
├── controller        # REST APIs
├── service           # Business logic
├── repository        # JPA repositories
├── model             # Entity classes
├── scheduler         # Scheduled execution
└── RegressionFrameworkApplication.java
```

---

## How to Run the Project

### Clone the Repository

```bash
git clone <your-repo-url>
cd regression-framework
```

###  Build the Project

```bash
mvn clean install
```

### Run Spring Boot Application

```bash
mvn spring-boot:run
```

### Execute Test Cases

```bash
mvn clean test
```

### Generate Allure Report

```bash
allure serve
```

---

## API Endpoints

| Endpoint     | Method | Description            |
| ------------ | ------ | ---------------------- |
| `/results`   | GET    | Fetch all test results |
| `/summary`   | GET    | Get pass/fail summary  |
| `/execution` | GET    | Execution details      |

---

## Database Details

* **Database**: MySQL
* **Table**: `test_results`

### Sample Fields:

* `id`
* `test_name`
* `status`
* `execution_time`

---

##  Execution Flow

1. Test cases are triggered manually or via scheduler
2. Selenium executes UI tests
3. TestNG manages execution and parallel runs
4. Results are stored in MySQL
5. APIs expose test results
6. Allure generates reports

---

## Screenshots (Add for better presentation)

* Test execution (browser automation)
* Console output
* Database table
* API response
* Allure report

---

## Project Modules

1. **Test Integration Engine** – Selenium & REST Assured integration
2. **Scheduling & Execution System** – Automated test runs
3. **Reporting & Logging Hub** – Allure reports & screenshots
4. **Result Analytics Tracker** – Test result analysis

---

## Challenges Faced

* Managing dependencies in Maven
* Fixing JPA and Lombok configuration issues
* Handling parallel execution
* Integrating reporting tools

---

## Outcome

* Efficient regression testing framework
* Reduced manual effort
* Faster execution with parallel testing
* Centralized test result management
* Improved debugging with reports

---

## Future Enhancements

* CI/CD integration (Jenkins/GitHub Actions)
* Dashboard UI for results visualization
* Advanced analytics and trends
* Cloud execution support

---

## Author

**Kavya**

---

## Acknowledgment

This project was developed as part of a learning and implementation process for building a real-world automation testing framework.

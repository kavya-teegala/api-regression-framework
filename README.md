# Automated Regression Testing Framework

---

##  Project Overview

The Automated Regression Testing Framework is a scalable, Java-based solution designed to automate, manage, and analyze regression testing for web and API applications.

It integrates Selenium for UI automation, REST-Assured for API testing, Spring Boot for RESTful services, and MySQL for persistent storage. The framework supports parallel execution, API-triggered test runs, reporting, and analytics.

---

##  Objectives

- Automate repetitive regression testing
- Reduce manual effort and human errors
- Enable parallel execution for faster test runs
- Provide REST APIs for execution and monitoring
- Store and analyze test results efficiently
- Generate detailed reports for debugging

---

##  Tech Stack

- Java – Core programming
- Selenium WebDriver – UI automation
- REST-Assured – API testing
- TestNG – Test execution & parallel runs
- Spring Boot – Backend & REST APIs
- Spring Data JPA – Database interaction
- MySQL – Data storage
- Allure Reports – Reporting
- Maven – Build & dependency management

---

##  Architecture Overview

- Controller Layer → Handles REST API requests
- Service Layer → Business logic and execution
- Repository Layer → Database interaction (JPA)
- Model Layer → Entity classes
- Test Layer → Selenium & API test cases
- Listener Layer → Screenshot, logging, DB storage

---

##  Key Features

### Test Execution
- Automated UI testing using Selenium
- API testing using REST-Assured
- Execution triggered via REST APIs

### Parallel Execution
- TestNG parallel execution support
- Reduced execution time

### Reporting & Logging
- Allure reports with detailed insights
- Screenshot capture on failure
- Execution logs

### Database Integration
- Stores test results in MySQL
- Tracks execution history

### REST APIs
- POST /execution/run → Trigger tests
- GET /execution/results → Fetch results
- GET /execution/results/summary → Summary
- GET /execution/status → Execution status

### Analytics
- Pass/Fail count
- Percentage-based analysis

### Frontend (Basic UI)
- Simple HTML dashboard
- Trigger tests
- View results

---

## Project Structure

src/main/java/com/framework/regressionframework

- controller
- service
- repository
- model
- utils
- tests
- RegressionFrameworkApplication.java

---

## How to Run

1. Clone Repository  
   git clone https://github.com/kavya-teegala/api-regression-framework.git  
   cd regression-framework

2. Build Project  
   mvn clean install

3. Run Application  
   mvn spring-boot:run

4. Execute Tests  
   mvn clean test

5. View Report  
   allure serve

---

##  API Endpoints

- POST /execution/run
- GET /execution/results
- GET /execution/results/summary
- GET /execution/status

---

## ️ Database

- MySQL database
- Table: test_result

Fields:
- id
- test_name
- status
- execution_time
- timestamp

---

##  Execution Flow

1. Trigger test via API/UI
2. TestNG executes tests
3. Selenium / REST-Assured runs tests
4. Listener captures results
5. Results stored in MySQL
6. Allure generates report

---

##  Screenshots

- UI automation (browser execution)
- API response (JSON)
- Database table
- Allure report
- Failure screenshot

---

##  Modules

1. Test Integration Engine
2. Scheduling & Execution System
3. Reporting & Log Collection Hub
4. Result Analytics Tracker

---

##  Challenges

- Maven dependency issues
- Spring Boot + TestNG integration
- Parallel execution handling
- Allure setup

---

## Outcome

- Fully automated regression testing
- Reduced manual effort
- Faster execution
- Centralized result tracking
- Improved debugging

---

##  Future Enhancements

- CI/CD integration
- Advanced dashboard
- Cloud execution

---

##  Author

Kavya

---

##  Acknowledgment

This project was Developed as part of learning and implementing a real-world automation testing framework.
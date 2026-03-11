# API & UI Regression Automation Framework

## Project Overview
This project is a Java-based Automation Framework developed to perform API and UI regression testing. The framework integrates REST Assured for API testing and Selenium WebDriver for UI automation to validate application functionality efficiently.

It supports data-driven testing using JSON files, automated test execution using TestNG, and Allure reports for detailed test reporting. The framework helps improve regression testing efficiency and ensures reliable software releases by detecting defects early.

## Tech Stack
- Java
- Apache Maven
- REST Assured
- Selenium WebDriver
- TestNG
- Allure Reports
- Git & GitHub

## Project Structure

src/main/java  
- base  
- configuration  
- utilities  

src/test/java  
- com.framework.regressionframework.tests  

src/test/resources  
- testdata.json  

## Features
- API automation using REST Assured
- UI automation using Selenium WebDriver
- JSON-driven test data support
- Test execution using TestNG
- Allure reporting integration
- Reusable utilities for framework components
- Maven dependency management
- Version control using GitHub

## How to Run the Tests

Clone the repository

git clone https://github.com/TeegalaKavya/api-regression-framework.git

Navigate to the project folder

cd api-regression-framework

Run tests

mvn clean test

Generate Allure report

allure serve allure-results

## Milestones Completed

Milestone 1
- Project setup using Maven
- Basic API automation framework using REST Assured
- Initial project structure setup
- Test execution using TestNG

Milestone 2
- Implemented JSON-driven API testing
- Integrated Allure reporting
- Added Selenium UI automation integration
- Developed and executed UI automation test scenarios
- Updated and pushed framework to GitHub

## Author
Kavya Teegala

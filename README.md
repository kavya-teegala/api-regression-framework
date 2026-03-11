# API Regression Automation Framework
## Project Overview
This project is a Java-based API Regression Automation Framework designed to automate REST API testing. The framework supports data-driven testing using JSON files and generates detailed execution reports.

## Tech Stack
- Java
- Apache Maven
- REST Assured
- TestNG
- Allure Report
- Selenium
- Git & GitHub

## Project Structure

src/main/java  
- utilities  
- base  
- configuration  

src/test/java  
- com.framework.regressionframework.tests  

src/test/resources  
- testdata.json  

## Features
- API automation using REST Assured
- JSON Driver test data
- Test execution using TestNG
- Allure reporting integration
- Selenium UI automation integration
- Maven dependency management

## How to Run the Tests

Clone the repository

git clone https://github.com/TeegalaKavya/api-regression-framework.git
Navigate to the project folder 
cd api-regression-framework
Run tests
mvn clean test
**Generate allure report**
allure serve allure results

## Milestones Completed

Milestone 1
- Project setup using Maven
- Basic API automation framework

Milestone 2
- JSON driven API testing
- Allure report integration
- Selenium UI automation integration
- Framework pushed to GitHub

## Author
Kavya Teegala

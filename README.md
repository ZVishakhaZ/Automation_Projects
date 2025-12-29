Automation Projects – Selenium TestNG Framework

This repository contains a scalable Selenium automation framework built using Java, TestNG, Maven, and Page Object Model (POM) principles. 
The framework supports data-driven testing using Excel, retry logic, TestNG listeners, logging, screenshot capture, and detailed reporting.

------------------------------------------------------------

TECH STACK

Language: Java (Java 17)
Automation Tool: Selenium WebDriver
Test Framework: TestNG
Build Tool: Maven
Design Pattern: Page Object Model (POM)
Logging: Log4j2
Reporting: Extent Reports
Data Driven Testing: Apache POI (Excel)
Version Control: Git & GitHub

------------------------------------------------------------

PROJECT STRUCTURE

src/test/java

└── base
 
     ├── BasePage.java
 
     ├──BaseTest.java
 
 └──page
 
     ├── LoginPage.java
       
     ├── InventoryPage.java
       
     ├── CartPage.java
 
     ├── CheckoutInformationPage.java
   
     ├── CheckoutOverviewPage.java
   
     ├── CheckoutCompletePage.java
 
 
 └── test
 
     ├── PurchaseFlowTest.java
 
 └── utils
 
     ├── ConfigReader.java
     
     ├── DataProviderUtils.java
     
     ├── DriverFactory.java
     
     ├── ExcelUtils.java
     
     ├── Log.java
     
     ├── RetryAnalyzer.java
     
     ├── RetryListener.java
     
     ├── ScreenshotUtils.java
     
     └── TestNGListener.java
     

src/test/resources

     ├── config.properties
 
     ├── qa.properties
 
     ├── staging.properties
 
     ├── log4j2.xml
 
     └── TestData.xlsx

reports

     ├── ExtentReport.html

screenshots

     ├── *.png

logs

     ├── test-log.log

pom.xml

testng.xml

------------------------------------------------------------

KEY FEATURES

- Page Object Model (POM) implementation
- Excel-based data-driven testing
- TestNG DataProvider integration
- TestNG Listener for:
  - Excel result write-back (PASS / FAIL / SKIP)
  - Screenshot capture on failure
  - Extent Report generation
- Retry mechanism for flaky tests
- Environment-based execution (QA / Staging)
- Thread-safe WebDriver management
- Centralized logging using Log4j2

------------------------------------------------------------

TEST DATA MANAGEMENT

- Test data is maintained in Excel
- File location:
  src/test/resources/TestData.xlsx
- Execution status, result, and remarks are written back to Excel automatically using TestNG Listener

------------------------------------------------------------

REPORTING AND LOGGING

- Extent Report generated after every execution:
  reports/ExtentReport.html

- Screenshots captured automatically on failure:
  screenshots/

- Execution logs:
  logs/test-log.log

------------------------------------------------------------

HOW TO RUN TESTS

Run using TestNG:
- Right click on testng.xml
- Run as TestNG Suite

Run using Maven:
mvn clean test

------------------------------------------------------------

FRAMEWORK HIGHLIGHTS

- Clean separation of test logic, page logic, and utilities
- DataProvider is the single source of truth for test data
- ExcelUtils handles read and write operations separately
- Listener-based result handling (industry best practice)
- Easily extendable for parallel execution and CI/CD integration

------------------------------------------------------------

AUTHOR

Vishakha Zalke

QA Automation Engineer

Open to learning, collaboration, and new opportunities

------------------------------------------------------------

FUTURE ENHANCEMENTS

- BDD (Cucumber) integration
- CI/CD pipeline using GitHub Actions or Jenkins
- Accessibility testing layer
- API automation integration

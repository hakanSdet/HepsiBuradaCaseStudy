# HepsiBuradaCaseStudy

This is a demo task prepared by Hakan KAHRAMAN for Amaris

- UI and Api test cases under same framework which was designed with OOP concept.
- On bussines layer, I use gherkin language inside BDD 
- On implementation layer, Java is my programming language 
- I used maven as my built magement tool which has pom.xml is brain of maven, manage dependecies and plugins

- Resource Directory - Feature Package
    - I use TCs with using Gherkin language inside this folder
    - Every feature file contains Scenarios or Scenario Outlines.
    - Each Scenario consists of test steps which has Given, When, Then.
- Step Definition Package
    - For each steps, I implement step definition by using annotations methods so that phrases turn into actions here
    - I also creating one special Hook class which includes @Before @After annotations and runs before or after each features
    - For each specific page that I am working on I create one object from that page inside step definitions
    - So that I can be able to use that class features
- Pages
    - To create object form pages, I implemented Page Object Model Design and create classes for each page under pages package.
    - In this pages folder, I am using PageFactory class to create web elements
    - I locate elements once and use them all the time
    - I write the methods inside by using java
- Runners
    - I trigger my framework from my runner class 
    - When test was failed, FailedTest runner run automatically.
    - By using plugin attribute, I created html report. By using maven verify can create Cucumber html report.
- Target
    - All default html or maven cucumber reports are stored here.
    - And Screenshots for failed test cases are included automatically in the report.
- Utilites
    - I stored my reusable code here.
    - I have Browser, Driver, Configuration Reader in utilities class
    - Beside that I have one Driver class which I created base on singleton design.
    - I have Configuration.properties file and I wrote some datas like url, browser type inside so that I centralize my datas
    - Driver class choose driver base on this file and use it for each test cases instead of creating new one for each and is designed available for parallel testing.

- Tools 
    - UI Test Cases
      - Java8, Selenium3, TestNg7(For Assertion), Cucumber5, BDD, Gherkin, Singleton Driver(available parallel testing) 
    - api Test Cases
      - Java8, Selenium3, JUnit5(For Assertion), Cucumber5, BDD, Gherkin, Singleton Driver(available parallel testing),RestAssured Library
      - Created Mock Api by Postman  
 

  

# Learn-Design-Patterns

Practice project applying the Page Object Model design pattern to a Selenium test suite.

## What it does
- Automates login and home-page flows against a public UI test-practice site
  (ashraaf7.github.io/AA-Practice-Test-Automation)
- Page objects (`P02_HomePage`, `p01_LoginPAge`) separate page structure from test logic
- Test data pulled from a `DataUtility` class backed by a properties/JSON file
- Test execution reported through Allure

## Tech stack
- Java
- Selenium WebDriver
- TestNG
- Allure Reporting
- Maven

# AutomationTaskApi

This is the test automation framework for automated testing of https://restcountries.com/#rest-countries.

## Framework components 

This test automation framework uses the following libraries and frameworks:
- Java JDK-1.11 as the programming language
- Maven as build tool and package management
- Cucumber as a testing tool that supports BDD
- AssertJ as a library for writing fluent and rich assertions in Java tests
- Allure framework as a reporting tool that provides modern-style reports
- Lombok as a Java library that is used to minimize or remove the boilerplate code
- Rest Assured as a framework with a lot of additional methods and libraries for API test automation

## Running the tests

For executing the tests using Maven open the command prompt in the root directory and use the next command

```
mvn clean test
```

## Report generation

For report generation in the command prompt use the next command

```
mvn allure:serve
```


## Authors

* **Larysa Denchuk**

# Mobile-App-Automation-Calculator-Appium
In this repository I have automated the Google LLC Calculator App and finally generated a allure report for the test results using Appium, Java, Selenium, TestNG and Allure Report.

## Scenario
Automate calculator app and do following tests:
1. Summation (321+123=198)
2. Subtraction (512-314=198)
3. Multiplication (715*65=46475)
4. Division (1560/30=52)
5. Solve this series 1 (100/10*5-10+60=100)
6. Solve this series 2 (50+10-20*2+10/2=25)  

## Tools and Tech
- Selenium Tools
- TestNG Framework
- Appium Server
- Gradle Build System
- Intellij IDE 
- Allure Report Generator


## How to run this project
- clone this project
- open project and load the build.gradle
- hit the following command into the root directory in terminal:
  - gradle clean test
- For generating Report in Allure hit
  - allure generate allure-results --clean -output
  - allure serve allure-results        
 

## Prerequisite
- JDK 8 or higher
- Configure GRADLE_HOME and set allure path
- Start Appium server

## Project Demonstration
https://github.com/foysal619/Mobile-App-Automation-Calculator-Appium/assets/61048879/d51a60d9-418e-42e8-89e6-87efb1ef4a4d

## Allure Results
![app automation allure results 1](https://github.com/foysal619/Mobile-App-Automation-Calculator-Appium/assets/61048879/51f35b1a-b827-42ce-9c7c-0dadb1a72e3b)
![app automation allure results behaivior 2](https://github.com/foysal619/Mobile-App-Automation-Calculator-Appium/assets/61048879/cc00b235-8b08-48ad-9a92-619017ea5d3e)





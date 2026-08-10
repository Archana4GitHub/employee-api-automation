\# 🚀 Employee API Automation Framework



> \*\*Production-style REST API automation framework using Java, REST Assured, TestNG, Maven and ExtentReports.\*\*



This project demonstrates automated \*\*CRUD API testing\*\*, positive and negative test coverage, reusable framework design, reporting, and Maven-based test execution.



\## 💼 Key Highlights



\* ✅ \*\*11 automated API test cases\*\*

\* ✅ CRUD testing — \*\*GET, POST, PUT, DELETE\*\*

\* ✅ Positive \& negative test scenarios

\* ✅ REST Assured-based API automation

\* ✅ TestNG test execution and suite management

\* ✅ Reusable `BaseTest` configuration

\* ✅ ExtentReports HTML reporting

\* ✅ Maven build and dependency management

\* ✅ Git/GitHub version control

\* ✅ Ready for \*\*CI/CD integration\*\*



\## 🛠️ Tech Stack



\*\*Java 21\*\* · \*\*REST Assured 5.5.6\*\* · \*\*TestNG 7.11.0\*\* · \*\*Maven\*\* · \*\*ExtentReports 5.1.2\*\* · \*\*Git/GitHub\*\*



\## 🧪 Test Coverage



| Category        | Coverage                       |

| --------------- | ------------------------------ |

| GET             | All employees / Employee by ID |

| POST            | Create employee                |

| PUT             | Update employee                |

| DELETE          | Delete employee                |

| Negative GET    | Non-existing employee          |

| Negative POST   | Missing/invalid data           |

| Negative PUT    | Non-existing employee          |

| Negative DELETE | Non-existing employee          |



\### API Endpoints



```text

GET     /api/employees

GET     /api/employees/{id}

POST    /api/employees

PUT     /api/employees/{id}

DELETE  /api/employees/{id}

```



\## 📊 Test Execution



```text

Tests run: 11

Failures: 0

Errors: 0

Skipped: 0

BUILD SUCCESS

```



\## 📈 ExtentReports



The framework generates an interactive HTML report containing:



\* Test execution summary

\* Pass/Fail status

\* Failed test details

\* Exception information

\* Test-level results



Report:



```text

test-output/ExtentReport.html

```



\## 📁 Framework Structure



```text

src/test/java/com/archana/api

│

├── base

│   └── BaseTest.java

│

├── reports

│   ├── ExtentReportManager.java

│   └── ExtentTestListener.java

│

└── tests

&#x20;   ├── EmployeeGetTest.java

&#x20;   ├── EmployeeGetByIdTest.java

&#x20;   ├── EmployeePostTest.java

&#x20;   ├── EmployeePutTest.java

&#x20;   ├── EmployeeDeleteTest.java

&#x20;   └── Negative Test Classes

```



\## ⚙️ Setup \& Execution



\### Prerequisites



\* Java 21

\* Maven

\* Git

\* Employee API running on `localhost:8080`



\### Clone



```bash

git clone https://github.com/Archana4GitHub/employee-api-automation.git

cd employee-api-automation

```



\### Install Dependencies



```bash

mvn clean install

```



\### Execute Tests



```bash

mvn clean test

```



\## 🔄 Automation Flow



```text

TestNG

&#x20;  ↓

REST Assured

&#x20;  ↓

Employee REST API

&#x20;  ↓

Response Validation

&#x20;  ↓

ExtentReports

&#x20;  ↓

HTML Test Report

```



\## 🎯 Skills Demonstrated



\*\*API Testing | REST Assured | Java | TestNG | Maven | CRUD Testing | Negative Testing | Test Automation Framework Design | ExtentReports | Git/GitHub | CI/CD\*\*



\## 👩‍💻 Author



\*\*Archana\*\*

QA Automation Engineer



\---



⭐ This project demonstrates practical API automation skills with a focus on \*\*reusability, maintainability, test coverage, reporting, and CI/CD readiness\*\*.




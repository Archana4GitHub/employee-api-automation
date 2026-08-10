# Employee API Automation Framework

**REST API automation framework built with Java, REST Assured, TestNG, Maven, and ExtentReports.**

This project demonstrates practical **API automation, CRUD testing, negative testing, reusable framework design, test reporting, and Maven-based execution**.

## 🚀 Key Highlights

* **11 automated API test cases**
* CRUD operations: **GET, POST, PUT, DELETE**
* Positive and negative test scenarios
* REST Assured API automation
* TestNG test suite and assertions
* Reusable BaseTest configuration
* ExtentReports HTML reporting
* Maven dependency and build management
* Git/GitHub version control
* CI/CD ready

## 🛠️ Tech Stack

| Technology    | Version         |
| ------------- | --------------- |
| Java          | 21              |
| REST Assured  | 5.5.6           |
| TestNG        | 7.11.0          |
| Maven         | 3.x             |
| ExtentReports | 5.1.2           |
| Git           | Version Control |
| GitHub        | Repository      |

## 🧪 API Test Coverage

| Method | Scenario                       |
| ------ | ------------------------------ |
| GET    | Get all employees              |
| GET    | Get employee by ID             |
| POST   | Create employee                |
| PUT    | Update employee                |
| DELETE | Delete employee                |
| GET    | Validate non-existing employee |
| POST   | Validate missing/invalid data  |
| PUT    | Validate non-existing employee |
| DELETE | Validate non-existing employee |

### Endpoints

```text
GET     /api/employees
GET     /api/employees/{id}
POST    /api/employees
PUT     /api/employees/{id}
DELETE  /api/employees/{id}
```

## 📁 Framework Structure

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
    ├── EmployeeGetTest.java
    ├── EmployeeGetByIdTest.java
    ├── EmployeePostTest.java
    ├── EmployeePutTest.java
    ├── EmployeeDeleteTest.java
    └── Negative Test Classes

pom.xml
testng.xml
.gitignore
README.md
```

## ⚙️ Setup

### Prerequisites

* Java 21
* Maven
* Git
* Employee API running on `localhost:8080`

### Clone Repository

```bash
git clone https://github.com/Archana4GitHub/employee-api-automation.git
cd employee-api-automation
```

### Install Dependencies

```bash
mvn clean install
```

### Run Tests

```bash
mvn clean test
```

## 📊 Test Result

Current execution result:

```text
Tests run: 11
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS
```

## 📈 ExtentReports

The framework generates an HTML test report containing:

* Test execution summary
* Pass/Fail status
* Failure details
* Exception information
* Test-level results

Report location:

```text
test-output/ExtentReport.html
```

## 🔄 Automation Flow

```text
TestNG
   ↓
REST Assured
   ↓
Employee REST API
   ↓
Response Validation
   ↓
ExtentReports
```

## 🎯 Skills Demonstrated

**API Testing · REST Assured · Java · TestNG · Maven · CRUD Testing · Negative Testing · Framework Design · ExtentReports · Git · GitHub · CI/CD**

## 👩‍💻 Author

**Archana**
QA Automation Engineer

---

⭐ **Built to demonstrate practical API automation and framework development skills.**

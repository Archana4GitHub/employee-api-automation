package com.archana.api.reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	private static ExtentReports extent;

	public static ExtentReports getReportInstance() {

		if (extent == null) {

			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");

			sparkReporter.config().setDocumentTitle("Employee API Automation Report");
			sparkReporter.config().setReportName("Employee API Test Report");

			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);

			extent.setSystemInfo("Project", "Employee API Automation");
			extent.setSystemInfo("Tester", "Archana");
			extent.setSystemInfo("Framework", "REST Assured + TestNG");
			extent.setSystemInfo("Java", "21");
		}

		return extent;
	}

}

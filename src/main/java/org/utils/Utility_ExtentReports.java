package org.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Utility_ExtentReports {
	public static ExtentReports getReport() {
		String path ="C:\\Users\\HP\\Eclipse workspace new\\Katlon_Project\\Reports\\regreport.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Demo reports");
		
		ExtentReports extents= new ExtentReports();
		extents.attachReporter(report);
		return extents;
	}
}

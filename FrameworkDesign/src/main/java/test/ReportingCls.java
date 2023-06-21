package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportingCls {
	
	public static ExtentReports extent;
	
	public static ExtentReports GenerateReport()  {
		// TODO Auto-generated method stub
		
		String reportpath = System.getProperty("user.dir")+"\\Reports\\testreport.html";
		
		ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
		
		spark.config().setDocumentTitle("QAExecutionResults");
		spark.config().setReportName("Regression Execution");
		spark.config().setCss(".badge {font-size: 100%;}");
				
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		return extent;
		
	}

}

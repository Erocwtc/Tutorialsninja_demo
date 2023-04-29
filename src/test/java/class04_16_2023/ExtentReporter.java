package class04_16_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static void generateExtentReport() throws Throwable {
	
	//1. make sure the dependcy of extentreports is inside pom.xml 
	
	//2 create the object of extentreportclass
		ExtentReports extentReport = new ExtentReports();
		
		//3 create the object of file class and pass the path of the .hml in the constructor
		File extentReportFile = new File(System.getProperty("user.dir") + "//test-output//ExtentReports//extentreport.html");

		
		//4 create the object of extentsparkreporter class and pass the file reference in constructor
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReportFile");
		
		//step 5 using the sparkReporter we can configure alot of things
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("TN Automation Results");
		sparkReporter.config().setDocumentTitle("TnReportTitle|Automation|Results");
		sparkReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss");
		
		//step 6: attach the ExtentReport with the SparkReporter
		extentReport.attachReporter(sparkReporter);
		
		//step 7 : additionial info (optional) system informationm and pass it in the extent reports
		//step 7.b Crete a properties fole and add necessary details in the properties file
		//step 7.c you have to write the code of how to read from the properties file here
		
		Properties prop = new Properties(); 
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\class04_16_2023\\config.properties");
				prop.load(ip);
				
				//Application url, browserNAme, password, operation system, java version
				extentReport.setSystemInfo("application url", prop.getProperty("url"));
				extentReport.setSystemInfo("browser name", prop.getProperty("browser"));
				extentReport.setSystemInfo("username", prop.getProperty("validUsername"));
				extentReport.setSystemInfo("password", prop.getProperty("validPassowrd"));
				extentReport.setSystemInfo("operating system", prop.getProperty("os.name"));
				extentReport.setSystemInfo("operating system version", prop.getProperty("os.Version"));
				
				
				
				
				//8Return the extentReport
				
				
		
		
}}
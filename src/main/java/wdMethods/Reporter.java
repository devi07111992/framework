package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {

	public static ExtentTest suiteTest,test;
	public static ExtentReports extent;


	//	@BeforeSuite
	public void begionReport()
	{
		//Genarate the basic html file readable mode e can do any modification
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/results.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	//	@BeforeClass
	public ExtentTest testCaseReportCreation(String testCaseName,String testCaseDesc )
	{
		suiteTest = extent.createTest(testCaseName,testCaseDesc);	
		return suiteTest;
	}


	//	@BeforeMethod
	public ExtentTest startTestIteration(String iteration,String catagory, String Author)
	{
		test=suiteTest.createNode(iteration);
		test=suiteTest.createNode(catagory);
		test=suiteTest.createNode(Author);
		
		return test;


	}
	public void reportstep(String desc,String status) throws IOException
	{
		if(status.equalsIgnoreCase("pass")) {
			test.pass(desc, MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img37.png").build());
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(desc, MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img38.png").build());
		} else if(status.equalsIgnoreCase("warning")) {
			test.warning(desc, MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img32.png").build());

		}
	}
	//@AfterSuite
	public void endResult() {
		extent.flush();
	}
}
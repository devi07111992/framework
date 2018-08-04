package wdMethods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6day1.ReadExcel;


public class Annotations extends SeMethods{
	public String testCaseName,testCaseDesc,author,category,iteration,excelfile;
	@BeforeSuite
	public void startReport() throws FileNotFoundException, IOException {
		begionReport();
		//loadObject();
	}
	
	@BeforeClass
	public void startTest() {
		
		testCaseReportCreation(testCaseName, testCaseDesc);
	}
	
	@Parameters({"url","pwd","userName"})
	@BeforeMethod
	public void login(String url,String paswd,String uName ) throws IOException {
		startTestIteration(iteration,author,category);
		startApp("chrome",url);
		WebElement user = locateElement("name","USERNAME");
		type(user,uName);
		WebElement pass = locateElement("id","password");
		type(pass,paswd);
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linkText","CRM/SFA");
		click(crm);
		
	}
	
	@AfterMethod
	public void closeApp() {
		
		closeBrowser();
	}
	@AfterSuite
	public void endReport() {
		endResult();
		
	}
	@DataProvider(name="fetchdata"/*indices= {0}*/)
	public Object[][] getData() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(excelfile);
	}

}


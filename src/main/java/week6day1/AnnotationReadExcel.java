package week6day1;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;


public class AnnotationReadExcel extends SeMethods {
	
	
	
	@Parameters({"url","userName","pwd"})
	@BeforeMethod()
	public void login(String url,String userName,String pwd) throws InterruptedException, IOException
	{
		
		startApp("chrome",url);
		WebElement user = locateElement("name","USERNAME");
		type(user,userName);
		WebElement pass = locateElement("id","password");
		type(pass,pwd);
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linkText","CRM/SFA");
		click(crm);
	}
	@AfterMethod()
	public void closeApp()
	{
		closeBrowser();
	
	}

}


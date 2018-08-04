package week2practice;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	 //@BeforeSuite
	 ExtentHtmlReporter html=new ExtentHtmlReporter("./repots/result.html");
	 html.setAppendExisting(true);
	 ExtentReports extent = new ExtentReports();
	 extent.attachReporter(html);
	 //@BeforeTest
	 String testcases = "TC001";
	 String testcaseDesc= "Create a new Lead in Leaftaps";
	 //@BeforeClass
	 ExtentTest suiteTest=extent.createTest(testcases,testcaseDesc);
	 //@BeforeMethod
	 ExtentTest test=suiteTest.createNode("Leads");
	 
				System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
				//System.out.println( "The tittle is :" + driver.getTitle()); 
				test.pass("The browser:Chrome Launched Successfully");
				driver.findElementById("username").sendKeys("demosalesmanager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementByLinkText("Find Leads").click();
				//driver.findElementByClassName("id").sendKeys("10755");
				driver.findElementByXPath("//*[@id=\"ext-gen248\"]']").sendKeys("Devi");
				driver.findElementByLinkText("Find Leads").click();
	}

}

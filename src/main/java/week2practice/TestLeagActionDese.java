package week2practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeagActionDese {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//System.out.println( "The tittle is :" + driver.getTitle()); 
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Ags Health pvd ltd");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karthick");
		driver.findElementById("createLeadForm_lastName").sendKeys("Mohan");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sathish");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Babu");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Farook");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dd2= new Select(source);
		dd2.selectByIndex(7);
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Friends");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("7.8Lacks");
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dd1= new Select(industry);
		dd1.selectByIndex(5);
		WebElement ownerShip=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3= new Select(ownerShip);
		dd3.selectByIndex(5);
		driver.findElementById("createLeadForm_sicCode").sendKeys("518");
		driver.findElementById("createLeadForm_description").sendKeys("Lead of the industry");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Lead of the industry");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("6402");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Medical Coding");
		WebElement preferredCurrency=driver.findElementById("createLeadForm_currencyUomId");
		Select dd4= new Select(preferredCurrency);
		dd4.selectByValue("INR");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Mahesh");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("WWW.AGSHEALTH.COM");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Dev");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("8, Rajive Gandhi Rd");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Kandhan chavadi");		
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement country=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd5= new Select(country);
		dd5.selectByValue("IND");
		Thread.sleep(5000);
		WebElement state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd6= new Select(state);
		dd6.selectByValue("IN-TN");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600104");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("0000");
		WebElement market=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd7= new Select(market);
		dd7.selectByVisibleText("Automobile");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9790715661");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("karthickmohan2006@gmail.com");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600104");
		/*driver.findElementByXPath("//input[@value='Create Lead']").click();
		System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
		driver.close();*/

	}

}

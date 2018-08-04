package week2day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelinumChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stumbr
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		/*ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		//System.out.println( "The tittle is :" + driver.getTitle()); 
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		/*List<WebElement> dd = driver.findElementsByTagName("select");
		int size = dd.size();
		WebElement get =dd.get(2);
		System.out.println(get);
		System.out.println(size);*/
		//driver.close();
		driver.findElementById("createLeadForm_companyName").sendKeys("Hexaware Technology ltd");
		driver.findElementById("createLeadForm_firstName").sendKeys("Devi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Mohan");
		//driver.findElementByClassName("smallSubmit").click();
		//driver.findElementById("ext-gen669").click();
		WebElement industry	=driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(industry);
		//dd1.selectByVisibleText("Computer Software");
		dd1.selectByIndex(8);
		long millis;
		/*List<WebElement> options = dd1.getOptions();
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
			WebElement Preferredcurrency =driver.findElementById("createLeadForm_currencyUomId");
			Select currency = new Select(Preferredcurrency);*/
			//driver.close();
			//currency.selectByIndex(3);
			/*List<WebElement> dd2 = currency.getOptions();
			for(WebElement eachotion1 : dd2) {
			System.out.println(eachotion1.getText());
			System.out.println(eachotion1.getAttribute("value"));*/
		Thread.sleep1("5000");
		}
		






	}



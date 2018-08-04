package week2day1.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		System.out.println( "The tittle is :" + driver.getTitle()); 
		/*if(driver.getTitle().contains("Leaftaps"))
			
		{
			System.out.println("The contains is : test Leaf");
		}else {
			System.out.println("No Contains Matches");
		}
		
		System.out.println( "The Current URL is :" + driver.getCurrentUrl()); 
		if(driver.getCurrentUrl().contains("opentaps"))
		{
			System.out.println("Print Current URL");
		}
		else
		{
			System.out.println("Not Matching");
		}*/
		System.out.println( "The Current URL is :" + driver.getCurrentUrl()); 
		//System.out.println("The PageSource of Current Page is :" + driver.getPageSource());
		/*driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println(driver.findElementByName("decorativeSubmit").getAttribute("value"));*/
		//driver.close();
		System.out.println(driver.findElementByLinkText("Docs Wiki").getAttribute("href"));
	}

}

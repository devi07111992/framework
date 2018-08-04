package week2practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailopen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/#");
		//Thread.sleep(15000);
		driver.findElementByLinkText("Sign In").click();
		driver.findElementById("identifierId").sendKeys("mdevi600@gmail.com" , Keys.ENTER);
		driver.findElementByName("password").sendKeys("devi07111992", Keys.ENTER);
		//driver.findElementByClassName("decorativeSubmit").click();

	}

}

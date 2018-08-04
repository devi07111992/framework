package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipKartSdmethod {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/fashion-budget-buys-test-store");
		WebElement drag=driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung=driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(drag).pause(3000).click(samsung).perform();
		Thread.sleep(2000);
		WebElement minprice = driver.findElementByXPath("(//select[@class='fPjUPw'])[1]");
		Select minprice1 =new Select(minprice);
		minprice1.selectByValue("25000");
		WebElement maxprice = driver.findElementByXPath("(//select[@class='fPjUPw'])[2]");
		Select maxprice1 =new Select(maxprice);
		maxprice1.selectByValue("60000");
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Screen Size']").click();
		driver.findElementByXPath("(//div[text()='48 - 55'])[1]").click();
		driver.findElementByXPath("(//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV'])[1]").click();





	}

}

package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDropBy {



	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/fashion-budget-buys-test-store");
		WebElement drag=driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung=driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(drag).pause(3000).click(samsung).perform();


	}

}

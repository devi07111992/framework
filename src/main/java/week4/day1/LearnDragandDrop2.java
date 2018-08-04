package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		WebElement drag=driver.findElementByLinkText("Droppable");
		drag.click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		Actions builder=new Actions(driver);
		WebElement source = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement target = driver.findElementByXPath("//div[@id='droppable']");
		builder.dragAndDrop(source, target).perform();





	}

}

package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {



	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		WebElement drag=driver.findElementByLinkText("Sortable");
		drag.click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		Actions builder=new Actions(driver);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item2 = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		int source1 = item2.getLocation().getX();
		int target2 = item2.getLocation().getY();
		builder.dragAndDropBy(item1,source1,target2).perform();





	}

}

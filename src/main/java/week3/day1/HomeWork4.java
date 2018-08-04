package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		 WebElement drag=driver.findElementByLinkText("Draggable");
		//driver.switchTo().pardraggableentFrame();
		driver.switchTo().frame(drag);
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();

		
	}

}

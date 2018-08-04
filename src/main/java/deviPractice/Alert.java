package deviPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
	    driver.switchTo().frame(index)
		
	}

}

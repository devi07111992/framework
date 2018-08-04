package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

    System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	//driver.manage().timeouts().implicitlyWait(30, SECONDS);
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("/html/body/button").click();
	Alert myAlert = driver.switchTo().alert();
	System.out.println(myAlert.getText());
	Thread.sleep(5000);
	myAlert.accept();
	Thread.sleep(5000);
	System.out.println(driver.findElementById("demo").getText());
	driver.switchTo().defaultContent();
	driver.findElementById("tryhome").click();
	//System.out.println(myAlert.getText());
	
	
	}
}
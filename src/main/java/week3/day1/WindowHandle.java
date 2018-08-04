package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//driver.manage().timeouts().implicitlyWait(30, SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPa	th("/html/body/button").click();
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		Thread.sleep(5000);
		myAlert.accept();
		Thread.sleep(5000);
		System.out.println(driver.findElementById("demo").getText());
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		String curruntWindow = driver.getWindowHandle();
		System.out.println(curruntWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listWindowHandle = new ArrayList<String>();
		listWindowHandle.addAll(allWindowHandle);
		driver.switchTo().window(listWindowHandle.get(1));
		System.out.println(listWindowHandle);
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.switchTo().window(listWindowHandle.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/

	}

}

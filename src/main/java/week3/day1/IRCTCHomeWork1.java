package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCHomeWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.manage().timeouts().implicitlyWait(30, SECONDS);
		driver.findElementByXPath("//*[@id=\"topnav\"]/li[3]/a").click();
		Set<String> allWindowHandel = driver.getWindowHandles();
		List<String> listWindowHandel = new ArrayList<String>();
		listWindowHandel.addAll(allWindowHandel);
		driver.switchTo().window(listWindowHandel.get(1));
		//System.out.println(listWindowHandel);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//Thread.sleep(10000);
		driver.switchTo().window(listWindowHandel.get(0));
		driver.findElementByLinkText("Compatible Browser").click();
		//driver.switchTo().window(listWindowHandel.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> pBrowser=driver.findElementsByXPath("//div[@class='content_12']//li");
        System.out.println(pBrowser.size());
        for(WebElement listOfBrowser:pBrowser)
        {
        	System.out.println(listOfBrowser.getText());
        }
		/*driver.switchTo().window(listWindowHandel.get(0));
		 * .
		driver.close();*/


	}

}

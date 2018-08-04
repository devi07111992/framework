package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
		int size = driver.findElementsByXPath("//section[@class='innerblock']/div/table/tbody/tr[2]/td").size();
		System.out.println(size);
		int size1 = driver.findElementsByXPath("//section[@class='innerblock']/div/table/tbody/tr").size();
		System.out.println(size1);
		String valueprint = driver.findElementByXPath("//section[@class='innerblock']/div/table/tbody/tr[3]/td[2]").getText();
		System.out.println(valueprint);
	}
}

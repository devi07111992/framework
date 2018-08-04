package week2practice;

import org.openqa.selenium.chrome.ChromeDriver;

import wdMethods.SeMethods;

public class VerifyFirstName extends SeMethods {


 browser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10224");
	}
	}

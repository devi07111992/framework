package week2day1.homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCTicketingSystem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("Devi");
		driver.findElementById("userRegistrationForm:password").sendKeys("123456");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("123456");
		WebElement SecurityQue =driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(SecurityQue);
		dd.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Jillu");
		WebElement dd1 = driver.findElementById("userRegistrationForm:prelan");
		Select prefferedlau = new Select(dd1);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Devi");
		driver.findElementById("userRegistrationForm:gender:1").click();

		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement dob = driver .findElementById("userRegistrationForm:dobDay");
		Select day = new Select(dob);
		day.selectByValue("07");
		Select month = new Select(dob);
		month.selectByValue("11");
		Select year = new Select(dob);
		year.selectByValue("11");
		WebElement Occupation = driver .findElementById("userRegistrationForm:occupation");
		Select occu = new Select(Occupation);
		occu.selectByValue("3");
		WebElement countries = driver .findElementById("userRegistrationForm:countries");
		Select coun = new Select(countries);
		coun.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("mdevi600@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9840392515");
		WebElement nationality = driver .findElementById("userRegistrationForm:nationalityId");
		Select natio = new Select(nationality);
		natio.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("saravana str");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600084",Keys.TAB);
		Thread.sleep(5000);
		WebElement cityname = driver .findElementById("userRegistrationForm:cityName");
		Select city = new Select(cityname);
		city.selectByValue("Chennai");
		Thread.sleep(5000);
		//driver .findElementById("userRegistrationForm:cityName").sendKeys(Keys.TAB);
		WebElement postoffice = driver .findElementById("userRegistrationForm:postofficeName");
		Select postoff = new Select(postoffice);
		postoff.selectByValue("Flowers Road S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("0447676543");








	} 

}

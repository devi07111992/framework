package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");

			driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
	//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		//first name
		driver.findElement(By.id("firstNameField")).sendKeys("Karthick");
		//lastname
		driver.findElement(By.id("lastNameField")).sendKeys("Mohan");
		//Enter firstNameLocal
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("karthick");
		//Enter lastNameLocal
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mohan");
		//Enter Salutation
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Mohan");
		//Enter Title
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("text12");
		//Enter Department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("depart");
		//Choose Preferred Currency
		WebElement curren = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select currency = new Select(curren);
		currency.selectByVisibleText("ALL - Albanian Lek");
		//Enter Description
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
		//Enter Important Note
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Important");
		//Enter Area Code
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("0445");
		//Enter Extension
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("04457");
		//Enter E-Mail Address
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Karthickmohan2006@gmail.com");
		//Enter Phone Number
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("80981333712");
		//Enter Person to Ask For
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("nothing");
		
		//capture name Appers in To Name field 
		WebElement captur=driver.findElement(By.id("generalToNameField"));
		//captur.sendKeys("devi");
		System.out.println(captur.getAttribute("value"));
		//Enter the Address Line 1
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("123 street");
		
		//Enter the City name
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("chennai");
		
		//Enter Zip/Postal Code
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600089");
		
		//Enter Zip/Postal Code Extension
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("600");
		//Enter Attention Name
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("decvi");
	
		//Choose Country
		WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select coun =new Select(country);
		coun.selectByVisibleText("India");
		//Choose State/Province
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sta =new Select(state);
		Thread.sleep(2000);
		sta.selectByVisibleText("TAMILNADU");
		//Click Create Contact button
		
		driver.findElement(By.name("submitButton")).click();
		
		//Verify the First name appears with capture name in To Field
		
		String verify=driver.findElement(By.id("viewContact_fullName_sp")).getText();
	       if(verify.contains("karthick")) 
	       {
	    	   System.out.println("The firstname is correct " + verify);
	       }
	    	   else 
	    	   {
	    		   System.out.println("The firstName isn't a given name");
	    	  }  
		
		//click edit
	       
	       driver.findElement(By.xpath("//a[text()='Edit']")).click();
	       
	       //choose New Marketing Campaign
	       WebElement market = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId"));
	       Select mark =new Select(market);
	       mark.selectByVisibleText("Automobile");
	       
	       //click add
	       
	       driver.findElement(By.xpath("//input[@value='Add']")).click();
	       //click update button
	       driver.findElement(By.xpath("//input[@value='Update']")).click();
	       
	       //Confirm the choosen Marketing Campaigns appears
	       String choose = driver.findElement(By.id("viewContact_marketingCampaigns_sp")).getText();
	       if(choose.contains("Automobile"))
	       {
	    	   System.out.println("The choosen " +choose+"  Marketing Campaigns appears is correct ");
	       }
	    	   else 
	    	   {
	    		   System.out.println("The choosen " +choose+"  Marketing Campaigns appears is not correct ");
	    	  }  
	 		
		
		
	}		

}

package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		/*ChromeOptions op = new ChromeOptions();
			op.setHeadless(true);*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		System.out.println( "The tittle is :" + driver.getTitle()); 
		driver.findElements("username").sendKeys("demosalesmanager");
		driver.findElements("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElement("createContactForm_primaryPhoneAreaCode").sendKeys("02");
		driver.findElement("createContactForm_primaryPhoneExtension").sendKeys("03");
		driver.findElement("createContactForm_primaryEmail").sendKeys("karthickmohan2006@gmail.com");
		driver.findElement("createContactForm_primaryPhoneNumber").sendKeys("044-6800205");
		driver.findElement("generalToNameField").sendKeys("Karthi");
		driver.findElement("createContactForm_generalAddress1").sendKeys("84/1, saravana perumal st");
		driver.findElement("createContactForm_generalCity").sendKeys("Purasaiwalkam");
		driver.findElement("createContactForm_generalPostalCode").sendKeys("600084");
		driver.findElement("createContactForm_generalPostalCodeExt").sendKeys("004");
		driver.findElement("createContactForm_generalAttnName").sendKeys("Devi");
		driver.findElement("createContactForm_generalAddress2").sendKeys("Willard ave");
		/*WebElement country	=driver.findElementById("createContactForm_generalCountryGeoId");
		Select dd1 = new Select(country);
		dd1.selectByValue("USA");
		Thread.sleep("2000");*/
		WebElement state	=driver.findElement("createContactForm_generalStateProvinceGeoId");
		Select dd1 = new Select(state);
		dd1.selectByValue("AL");
		//Enter Description
				driver.findElement("createContactForm_description").sendKeys("Description");
				//Enter Important Note
				driver.findElement("createContactForm_importantNote").sendKeys("Important");
				//Enter Area Code
				driver.findElement("createContactForm_primaryPhoneAreaCode").sendKeys("0445");
				//Enter Extension
				driver.findElement("createContactForm_primaryPhoneExtension").sendKeys("04457");
				//Enter E-Mail Address
				driver.findElement("createContactForm_primaryEmail").sendKeys("nithyac2@in.ibm.com");
				//Enter Phone Number
				driver.findElement("createContactForm_primaryPhoneNumber").sendKeys("80981333712");
				//Enter Person to Ask For
				driver.findElement("createContactForm_primaryPhoneAskForName").sendKeys("nothing");
				
				//capture name Appers in To Name field 
				WebElement captur=driver.findElement("generalToNameField"));
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
				sta.selectByVisibleText("Indiana");
				//Click Create Contact button
				
				driver.findElement(By.name("submitButton")).click();
				
				//Verify the First name appears with capture name in To Field
				
				String verify=driver.findElement(By.id("viewContact_fullName_sp")).getText();
			       if(verify.contains("Nithya")) 
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

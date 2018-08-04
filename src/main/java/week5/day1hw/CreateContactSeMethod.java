package week5.day1hw;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateContactSeMethod extends Annotations {
@Test
	public void create() throws InterruptedException, IOException {
		
		/*startApp("chrome","http://leaftaps.com/opentaps");
		WebElement user = locateElement("name","USERNAME");
		type(user,"DemoSalesManager");
		WebElement pass = locateElement("id","password");
		type(pass,"crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linkText","CRM/SFA");
		click(crm);*/
		WebElement create = locateElement("xpath","//a[text()='Create Contact']");
		click(create);
		
		//first name
		WebElement fName = locateElement("id","firstNameField");
		type(fName,"Devi");
		//lastname
		WebElement lName = locateElement("id","lastNameField");
		type(lName,"M");
		//Enter firstNameLocal
		WebElement fNameLocal = locateElement("id","createContactForm_firstNameLocal");
		type(fNameLocal,"Deviii");
		//Enter lastNameLocal
		WebElement lNameLocal = locateElement("id","createContactForm_lastNameLocal");
		type(lNameLocal,"Chidu");
		//Enter Salutation
		WebElement salutation = locateElement("id","createContactForm_personalTitle");
		type(salutation,"chiduuu");
		//Enter Title
		WebElement title = locateElement("id","createContactForm_generalProfTitle");
		type(title,"Text1");
		//Enter Department
		WebElement department = locateElement("id","createContactForm_departmentName");
		type(department,"depart");
		//Choose Preferred Currency
		WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(currency,"ALL - Albanian Lek");
		//Enter Description
		WebElement description = locateElement("id","createContactForm_description");
		type(description,"Description");
		
		//Enter Important Note
		WebElement note = locateElement("id","createContactForm_importantNote");
		type(note,"note");
		
		//Enter Area Code
		WebElement area = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(area,"0445");
		
		
		//Enter Extension
		WebElement extension = locateElement("id","createContactForm_primaryPhoneExtension");
		type(extension,"04457");
		
		//Enter E-Mail Address
		WebElement email = locateElement("id","createContactForm_primaryEmail");
		type(email,"devim@hexaware.com");
		
		//Enter Phone Number
		WebElement phoneNo = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phoneNo,"9840392515");
		
		//Enter Person to Ask For
		WebElement personask = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(personask,"noything");
		
		//capture name Appers in To Name field 
		WebElement appearName = locateElement("id","generalToNameField");
		
		getAttribute(appearName,"value");
		
		//Enter the Address Line 1
		WebElement address = locateElement("id","createContactForm_generalAddress1");
		type(address,"123 street");
		
		//Enter the City name
		WebElement cityName = locateElement("id","createContactForm_generalCity");
		type(cityName,"chennai");
		
		//Enter Zip/Postal Code
		WebElement postalCode = locateElement("id","createContactForm_generalPostalCode");
		type(postalCode,"600084");
		
		//Enter Zip/Postal Code Extension
		WebElement postalCodeExt = locateElement("id","createContactForm_generalPostalCodeExt");
		type(postalCodeExt,"600");
		
		//Enter Attention Name
		WebElement attention = locateElement("id","createContactForm_generalAttnName");
		type(attention,"Devi");
		
		//Choose Country
		WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(country,"India");
	Thread.sleep(2000);
		
		//Choose State/Province
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		Thread.sleep(2000);
		selectDropDownUsingText(state,"TAMILNADU");
		
		//Click Create Contact button
		WebElement contactButton = locateElement("name","submitButton");
		click(contactButton);
		
		
		//Verify the First name appears with capture name in To Field
		WebElement verifyFirst = locateElement("id","viewContact_fullName_sp");
		verifyPartialText(verifyFirst,"Nithya");
		//click edit
		
		WebElement edit = locateElement("xpath","//a[text()='Edit']");
		click(edit);
		
		//choose New Marketing Campaign
		
		WebElement newMarket = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(newMarket,"Automobile");
		
		//click add
		
		WebElement add = locateElement("xpath","//input[@value='Add']");
		click(add);
		
		//click update button
		
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		
		//Confirm the choosen Marketing Campaigns appears
		WebElement verifyChoosenMarket = locateElement("id","viewContact_marketingCampaigns_sp");
		verifyPartialText(verifyChoosenMarket,"Automobile");
		
//		closeBrowser();
		
		
		
			}
}


package week5.day1hw;

	
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

	public class MergeLeadSeMethod  extends Annotations{
		@Test
		public void Merge() throws InterruptedException, IOException
		{
			
			/*startApp("chrome", "http://leaftaps.com/opentaps");
			//Login
			WebElement eUserName=locateElement("username");
			type(eUserName,"DemoSalesManager");
			WebElement ePassword=locateElement("password");
			type(ePassword,"crmsfa");
			WebElement eLogin=locateElement("class","decorativeSubmit");
			click(eLogin);
			//Click on CRM/SFA
			WebElement eCrmSfa =locateElement("linkText","CRM/SFA");
			click(eCrmSfa);*/
			//Click Leads
			WebElement eLeads=locateElement("xpath","//a[text()='Leads']");
			click(eLeads);
			//click merge leads
			WebElement eMergeLead=locateElement("xpath","//a[text()='Merge Leads']");
			click(eMergeLead);
			//Click on Icon near From Lead
			WebElement eIcon =locateElement("xpath","//img[@src='/images/fieldlookup.gif']");
			click(eIcon);
			//Move to new window
			switchToWindow(1);
			//Enter Lead ID
			WebElement eLeadId=locateElement("xpath","//input[@class=' x-form-text x-form-field'] ");
			type(eLeadId,"10779");
			//Click Find Leads button
			Thread.sleep(5000);
			WebElement eFindLeads =locateElement("xpath","//button[text()='Find Leads']");
			click(eFindLeads);
			//Click First Resulting lead
			Thread.sleep(2000);
			WebElement eFirstLead=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a");
			click(eFirstLead);
		    //Switch back to primary window
			switchToWindow(0);
			WebElement icon = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
			click(icon);
			//Move to new window
			switchToWindow(1);
			//Enter Lead ID
			WebElement eLeadIdTo=locateElement("xpath","//input[@class=' x-form-text x-form-field'] ");
			type(eLeadIdTo,"10786");
			Thread.sleep(2000);
			//Click Find Leads button
			WebElement eFindLeadsTo =locateElement("xpath","//button[text()='Find Leads']");
			click(eFindLeadsTo);
			//Click First Resulting lead
			Thread.sleep(2000);
			WebElement eFirstLeadTo=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a");
			click(eFirstLeadTo);
			//Switch back to primary window
			switchToWindow(0);
	        //Click on Merge
			WebElement merge = locateElement("class","buttonDangerous");
			click(merge);
			//Accept Alert
			getAlertText();
			acceptAlert();
		//Click find Leads
			WebElement cFindLead =locateElement("xpath","//a[text()='Find Leads']");
			click(cFindLead);
			//Enter from leadID
			WebElement fromLeadId=locateElement("xpath","//div[@class='x-form-item x-tab-item']//input");
			type(fromLeadId,"10779");
			//Click Find Leads
			WebElement clickFind=locateElement("xpath","//button[text()='Find Leads']");
			click(clickFind);
			WebElement error=locateElement("xpath","//div[text()='No records to display']");
			verifyPartialText(error,"No records");
			
			//closeBrowser();

		}

		

	}


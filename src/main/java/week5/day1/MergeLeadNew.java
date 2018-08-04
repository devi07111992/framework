package week5.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLeadNew extends Annotations {
	@Test
	public void table()
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
	WebElement first=locateElement("xpath","//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//following-sibling::td[2]/div");
	click(first);

}

	/*private void clickNoSnap(WebElement first) {
		// TODO Auto-generated method stub
		
	}*/
}



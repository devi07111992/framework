package week5.day1hw;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class EditLeadSeMethod extends Annotations {
	
	@Test()
	public void editLead() throws InterruptedException, IOException {
		
		/*startApp("chrome","http://leaftaps.com/opentaps");
		WebElement user = locateElement("name","USERNAME");
		type(user,"DemoSalesManager");
		WebElement pass = locateElement("id","password");
		type(pass,"crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linkText","CRM/SFA");
		click(crm);*/
		//Click Leads link
		WebElement leads =locateElement("xpath","//a[text()='Leads']");
		click(leads);
		//Click Find leads
		WebElement findLeads =locateElement("xpath","//ul[@class='shortcuts']/li[3]/a");
		click(findLeads);
		//Enter first name
		WebElement fName = locateElement("xpath","(//div[@class='x-form-item x-tab-item'])[2]//input");
		type(fName,"Devi");
		//Click Find leads button
		WebElement findLeadsButton =locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(5000);
		WebElement firstResultLead=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		getText(firstResultLead);
		click(firstResultLead);
		//getTitle();
		verifyTitle("View Lead | opentaps CRM");
		Thread.sleep(5000);
		//Click Edit
		WebElement edit =locateElement("xpath","//a[text()='Edit']");
		click(edit);
		//Change the company name
		WebElement company=locateElement("updateLeadForm_companyName");
		clear(company);
		type(company,"Hexaware Technology Ltd");
		//Click Update
		WebElement update=locateElement("xpath","//input[@class='smallSubmit']");
		click(update);
		WebElement changeName=locateElement("xpath","(//span[@class='tabletext'])[3]");
		verifyPartialText(changeName,"Hexaware Technology Ltd");
		//closeBrowser();
	}

}


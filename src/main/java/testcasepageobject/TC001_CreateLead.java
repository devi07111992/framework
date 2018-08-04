package testcasepageobject;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHome;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations {
	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "TC003";
		testCaseDesc = "CreateLeadData";
		iteration="leads";
		author="Devi";
		category="smoke";
		excelfile="CreateLead1";
	}
	@Test(dataProvider="fetchdata")
	public void creatLead(String comp,String fName,String lName) throws InterruptedException, IOException
	{
		new MyHome()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(comp)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);
		
		
	
	   
	   
	}

}

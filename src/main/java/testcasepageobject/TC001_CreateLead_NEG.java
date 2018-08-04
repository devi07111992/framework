package testcasepageobject;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHome;
import wdMethods.Annotations;

public class TC001_CreateLead_NEG extends Annotations {
	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "TC003";   //Change by ganesh
		testCaseDesc = "CreateLeadData_NEG";
		iteration="leads";
		author="Devi";
		category="Smoke123";  //change by Divya
		excelfile="CreateLeadNEG";
	}
	@Test(dataProvider="fetchdata")
	public void creatLead(String comp,String fName,String lName,String errMsg) throws InterruptedException, IOException
	{
		new MyHome()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(comp)
		.typeFirstName(fName)
		.typeLastName(lName)
		//.clickSubmit()
		//.verifyFirstName(fName);
		.clickSubmitNEG();
	
	   
	   
	}

}

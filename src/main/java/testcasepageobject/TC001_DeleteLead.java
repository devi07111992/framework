package testcasepageobject;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHome;
import wdMethods.Annotations;

public class TC001_DeleteLead extends Annotations {
	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "TC003";
		testCaseDesc = "EditLeadData";
		iteration="Editleads";
		author="Karthick";
		category="Sanity";
		excelfile="DeleteLead";
	}
	@Test(dataProvider="fetchdata")
	public void deleteLead(String comp,String fName,String lName,String updateCom,String updateCompany) throws InterruptedException, IOException
	{
		new MyHome()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(comp)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName)
		.clickEdit()
		.editCompanyName(updateCompany)
		.clickUpdate()
		.verifyComp(updateCompany)
	    .
		
		
		
	
      
        
	}
	

}

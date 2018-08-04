package advancedtestcase;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import wdMethods.Annotations;
import wdMethods.SeMethods;


public class CreateLeadData extends Annotations

{
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
		/*//@BeforeSuite
				ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
				html.setAppendExisting(true);		
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(html);
				//@BeforeTest
				String testCasesName = "TC001";
				String testCasesDesc = "Create a new Lead in Leaftaps";
				
				//@BeforeClass
				ExtentTest suiteTest = extent.createTest(testCasesName, testCasesDesc);
			//@BeforeMethod
				ExtentTest test = suiteTest.createNode("Leads");
		//testCaseReportCreation("TC001","CreateLead");
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement user = locateElement("name","USERNAME");
		type(user,"DemoSalesManager");
		WebElement pass = locateElement("id","password");
		type(pass,"crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		test.pass("chrome lauched", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img37.png").build());
		WebElement crm = locateElement("linkText","CRM/SFA");
		click(crm);*/
		
		Thread.sleep(2000);
		WebElement xp =locateElement("xpath","//ul[@class='shortcuts']/li/a");
		click(xp);
		WebElement company=locateElement("createLeadForm_companyName");
		type(company,comp);
		WebElement name=locateElement("createLeadForm_firstName");
		type(name,fName);
		WebElement lastName=locateElement("createLeadForm_lastName");
		type(lastName,lName);
		/*WebElement firstnameloc=locateElement("createLeadForm_firstNameLocal");
		type(firstnameloc,fLocal);
		WebElement lastNameloc=locateElement("createLeadForm_lastNameLocal");
		type(lastNameloc,lLocal);
		WebElement salutation=locateElement("createLeadForm_personalTitle");
		type(salutation,personal);*/
	/*	WebElement ee=locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(ee,dataso);
		getText(ee);
		WebElement title=locateElement("createLeadForm_generalProfTitle");
		type(title,generalPro);
	WebElement annual=locateElement("createLeadForm_annualRevenue");
		type(annual,""+annualRe);
		WebElement industry=locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industry,industryEn);

		WebElement ownership=locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(ownership,owner);
		WebElement sic=locateElement("createLeadForm_sicCode");
		type(sic,""+sicCo);
		WebElement description=locateElement("createLeadForm_description");
		type(description,descri);
		WebElement important=locateElement("createLeadForm_importantNote");
		type(important,impor);
		WebElement country=locateElement("createLeadForm_primaryPhoneCountryCode");
		clear(country);
		type(country,""+primaryPho);
		WebElement area=locateElement("createLeadForm_primaryPhoneAreaCode");
		type(area,""+phoneArea);

		WebElement extension=locateElement("createLeadForm_primaryPhoneExtension");
		type(extension,""+primaryPhoneEx);

	WebElement department=locateElement("createLeadForm_departmentName");
		type(department,depar);
		WebElement currency=locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingText(currency,curr);
		WebElement employee=locateElement("createLeadForm_numberEmployees");
		type(employee,""+num);
		WebElement ticker=locateElement("createLeadForm_tickerSymbol");
		type(ticker,tic);
		WebElement person=locateElement("createLeadForm_primaryPhoneAskForName");
		type(person,PhoneAs);
		WebElement url=locateElement("createLeadForm_primaryWebUrl");
		type(url,primaryWeb);

		WebElement nam=locateElement("createLeadForm_generalToName");
		type(nam,generalTo);
		WebElement addr=locateElement("createLeadForm_generalAddress1");
		type(addr,generalAd);
		WebElement addres=locateElement("createLeadForm_generalAddress2");
		type(addres,generalAddre);

		WebElement city=locateElement("createLeadForm_generalCity");
		type(city,generalCi);
		WebElement state=locateElement("createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingValue(state,generalSta);
		WebElement count=locateElement("createLeadForm_generalCountryGeoId");
		selectDropDownUsingValue(count,generalCo);
		WebElement post=locateElement("createLeadForm_generalPostalCode");
		type(post,""+generalPo);
		WebElement postex=locateElement("createLeadForm_generalPostalCodeExt");
		type(postex,""+generalPost);

		WebElement campaign=locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingValue(campaign,marke);
		WebElement phon=locateElement("createLeadForm_primaryPhoneNumber");
		type(phon,""+primaryPhoneN);
		WebElement email=locateElement("createLeadForm_primaryEmail");
		type(email,primaryEm);
		WebElement leadc=locateElement("class","smallSubmit");
		click(leadc);
		WebElement verifyname= locateElement("viewLead_firstName_sp");
		 getText(verifyname);
			 verifyExactText(verifyname,firstNa);
//			 closeBrowser();
		 //extent.flush();		
*/	}}
	

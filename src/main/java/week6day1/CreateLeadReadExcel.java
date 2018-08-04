package week6day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;
import week6day1.ReadExcel;

public class CreateLeadReadExcel extends AnnotationReadExcel

{
	@Test(dataProvider = "createLead")

	public void creatLead(String cName, String fName, String lName, String ph, String email)
			throws InterruptedException, IOException {
		/*
		 * startApp("chrome","http://leaftaps.com/opentaps"); WebElement user =
		 * locateElement("name","USERNAME"); type(user,"DemoSalesManager"); WebElement
		 * pass = locateElement("id","password"); type(pass,"crmsfa"); WebElement login
		 * = locateElement("class","decorativeSubmit"); click(login); WebElement crm =
		 * locateElement("linkText","CRM/SFA"); click(crm);
		 */
		// Thread.sleep(2000);
		WebElement xp = locateElement("xpath", "//ul[@class='shortcuts']/li/a");
		click(xp);
		WebElement company = locateElement("createLeadForm_companyName");
		type(company, cName);
		WebElement name = locateElement("createLeadForm_firstName");
		type(name, fName);
		WebElement lastName = locateElement("createLeadForm_lastName");
		type(lastName, lName);
		// WebElement firstnameloc=locateElement("createLeadForm_firstNameLocal");
		// type(firstnameloc,"Devii");
		/*
		 * WebElement lastNameloc=locateElement("createLeadForm_lastNameLocal");
		 * type(lastNameloc,"chidu"); WebElement
		 * salutation=locateElement("createLeadForm_personalTitle");
		 * type(salutation,"Text"); WebElement
		 * ee=locateElement("createLeadForm_dataSourceId");
		 * selectDropDownUsingText(ee,"Employee"); getText(ee); WebElement
		 * title=locateElement("createLeadForm_generalProfTitle");
		 * type(title,"TestLeaf"); WebElement
		 * annual=locateElement("createLeadForm_annualRevenue"); type(annual,"67466");
		 * WebElement industry=locateElement("createLeadForm_industryEnumId");
		 * selectDropDownUsingIndex(industry,3);
		 * 
		 * WebElement ownership=locateElement("createLeadForm_ownershipEnumId");
		 * selectDropDownUsingText(ownership,"Partnership"); WebElement
		 * sic=locateElement("createLeadForm_sicCode"); type(sic,"23434"); WebElement
		 * description=locateElement("createLeadForm_description");
		 * type(description,"Test test Practice"); WebElement
		 * important=locateElement("createLeadForm_importantNote");
		 * type(important,"nothing"); WebElement
		 * country=locateElement("createLeadForm_primaryPhoneCountryCode");
		 * clear(country); type(country,"4"); WebElement
		 * area=locateElement("createLeadForm_primaryPhoneAreaCode"); type(area,"23");
		 * 
		 * WebElement extension=locateElement("createLeadForm_primaryPhoneExtension");
		 * type(extension,"43559");
		 * 
		 * WebElement department=locateElement("createLeadForm_departmentName");
		 * type(department,"345"); WebElement
		 * currency=locateElement("createLeadForm_currencyUomId");
		 * selectDropDownUsingText(currency,"INR - Indian Rupee"); WebElement
		 * employee=locateElement("createLeadForm_numberEmployees"); type(employee,"2");
		 * WebElement ticker=locateElement("createLeadForm_tickerSymbol");
		 * type(ticker,"ticker"); WebElement
		 * person=locateElement("createLeadForm_primaryPhoneAskForName");
		 * type(person,"name"); WebElement
		 * url=locateElement("createLeadForm_primaryWebUrl");
		 * type(url,"http://leaftaps.com/opentaps");
		 * 
		 * WebElement nam=locateElement("createLeadForm_generalToName");
		 * type(nam,"nithya"); WebElement
		 * addr=locateElement("createLeadForm_generalAddress1");
		 * type(addr,"123 street"); WebElement
		 * addres=locateElement("createLeadForm_generalAddress2");
		 * type(addres,"venkateshvara nagar");
		 * 
		 * WebElement city=locateElement("createLeadForm_generalCity");
		 * type(city,"Chennai"); WebElement
		 * state=locateElement("createLeadForm_generalStateProvinceGeoId");
		 * selectDropDownUsingValue(state,"IN"); WebElement
		 * count=locateElement("createLeadForm_generalCountryGeoId");
		 * selectDropDownUsingValue(count,"IND"); WebElement
		 * post=locateElement("createLeadForm_generalPostalCode"); type(post,"600089");
		 * WebElement postex=locateElement("createLeadForm_generalPostalCodeExt");
		 * type(postex,"43559");
		 * 
		 * WebElement campaign=locateElement("createLeadForm_marketingCampaignId");
		 * selectDropDownUsingValue(campaign,"CATRQ_AUTOMOBILE");
		 */
		WebElement phon = locateElement("createLeadForm_primaryPhoneNumber");
		// type(phon,""+ ph);
		type(phon, ph);
		WebElement email1 = locateElement("createLeadForm_primaryEmail");
		type(email1, email);
		/*
		 * WebElement leadc=locateElement("class","smallSubmit"); click(leadc);
		 * WebElement verifyname= locateElement("viewLead_firstName_sp"); //
		 * getText(verifyname); verifyExactText(verifyname,"Nithya"); // closeBrowser();
		 */
	}

	@DataProvider(name = "createLead")

	public Object[][] getData() throws IOException {
		ReadExcel excel = new ReadExcel();
		return excel.readExcel("CreateLead");
		//return excel.(methodname)("Excelsheetsavedname");
		/*
		 * //Object [][] data=new Object[2][5]; data[0][0]="Hexaware";
		 * data[0][1]="Devi"; data[0][2]="Mohan"; data[0][3]= 98403925;
		 * data[0][4]="devim@Hexaware.com";
		 * 
		 * 
		 * data[1][0]="AGS"; data[1][1]="Karthick"; data[1][2]="Mohan";
		 * data[1][3]=97907156; data[1][4]="karthick@gmail.com";
		 * 
		 * data[2][0]="AGS"; data[2][1]="Karthick"; data[2][2]="Mohan";
		 * data[2][3]=97907156; data[2][4]="karthick@gmail.com";
		 * 
		 * return data;
		 */
	}

}

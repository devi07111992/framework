package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class FindLeadOpenTaps extends Annotations {

	public FindLeadOpenTaps()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Name and ID']")
	WebElement eleClickPhone;
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleTypeFirstName;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleClickFindLeads;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleClickFirstRecord;
	
	public FindLeadOpenTaps clickPhoneNo() throws IOException
	{
		click(eleClickPhone);
		return this;
	}
	
	public FindLeadOpenTaps typeFirstName(String fName) throws IOException
	{
		type(eleTypeFirstName,fName);
		return this;
	}
	public FindLeadOpenTaps clickFindLead() throws IOException
	{
		click(eleClickFindLeads);
		return this;
	}
	public ViewLeadOpenTapsCRM ClickFirstRecord() throws IOException
	{
		click(eleClickFirstRecord);
		return new ViewLeadOpenTapsCRM();
	}
	
	
	
	
	
}


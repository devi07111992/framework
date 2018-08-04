package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeadOpenTaps  extends Annotations {
	
	public ViewLeadOpenTaps()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_companyName_sp")
		WebElement eleVerifyComName;
	
	@FindBy(xpath="//a[@class='selected']]")
	WebElement eleClickFindLeads;
	
	@FindBy(xpath="//a[@class='subMenuButtonDangerous']")
	WebElement eleClickDelete;
	
	public ViewLeadOpenTaps verifyComp(String eleText)
	{
		verifyExactText(eleVerifyComName,eleText);
		return this;
	}
	
	
	public FindLeadOpenTaps clickDeleteLeads() throws IOException
	{
		click(eleClickFindLeads);
		return new FindLeadOpenTaps();
	}
	
	
}

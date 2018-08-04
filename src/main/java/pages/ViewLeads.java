package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations;

public class ViewLeads extends Annotations{
	
	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_firstName")
		WebElement eleFirstName;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleEdit;
		
		public ViewLeads verifyFirstName(String eleText)
		{
			verifyExactText(eleFirstName,eleText);
			return this;
			
		}
		public Opentaps clickEdit() throws IOException
		{
			click(eleEdit);
			return new Opentaps();
		}
		

}

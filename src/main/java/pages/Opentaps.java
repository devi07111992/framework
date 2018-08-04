package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLead;
import pages.ViewLeads;
import wdMethods.Annotations;

public class Opentaps  extends Annotations {
	
	public Opentaps()
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="updateLeadForm_companyName")
		WebElement eleUpdateComName;
		
		@FindBy(xpath="//input[@class='smallSubmit']")
		WebElement eleclickUpdate;
		
		public Opentaps editCompanyName(String updateCompany) throws IOException
		{
			//clear(comp);
			type(eleUpdateComName,updateCompany);
			return this;
		} 
		

		public ViewLeadOpenTaps clickUpdate() throws IOException
		{
			click(eleclickUpdate);
		return new ViewLeadOpenTaps();
			
		}

}

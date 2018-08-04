package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadsPage extends Annotations{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(linkText="Create Lead")
		WebElement eleCreteLeads;
		
		public CreateLead clickCreateLeads() throws IOException
		{
			//WebElement eleLeads= locateElement("linkText","Leads");
			click(eleCreteLeads);
			return new CreateLead();
			
		
	}

		
}

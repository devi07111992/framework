package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyHome extends Annotations{
	
	public MyHome()
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[text()='Leads']")
		WebElement eleLeads;
		
		public MyLeadsPage clickLeads() throws IOException
		{
			//WebElement eleLeads= locateElement("linkText","Leads");
			//WebElement eleLeads= locateElement("linkText",prop.getProperty("MyHome.Object.link"));
			//click(eleLeads);
			return new MyLeadsPage();
			
		
	}

}

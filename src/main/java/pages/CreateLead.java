
package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLead extends Annotations{
	
	public CreateLead()
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="createLeadForm_companyName")
		WebElement eleComName;
		
		@FindBy(id="createLeadForm_firstName")
		WebElement eleFirstName;
		
		@FindBy(id="createLeadForm_lastName")
		WebElement eleLastName;
		
		@FindBy(name="submitButton")
		WebElement eleClickCreateLead;
		
		@FindBy(className="errorList")
		WebElement eleErrorMsg;
		
		
		
		public CreateLead typeCompanyName(String comp) throws IOException
		{
			type(eleComName,comp);
			return this;
		}
		public CreateLead typeFirstName(String fName) throws IOException
		{
			type(eleFirstName,fName);
			return this;
		}
		
		public CreateLead typeLastName(String lName) throws IOException
		{
			type(eleLastName,lName);
			return this;
		}
		
		
		public ViewLeads clickSubmit() throws IOException
		{
			click(eleClickCreateLead);
			return new ViewLeads();
		}
		public CreateLead clickSubmitNEG() throws IOException
		{
			click(eleClickCreateLead);
			return this;
		}
		public CreateLead errorMsg(String errMsg) throws IOException
		{
			verifyPartialText(eleErrorMsg,errMsg);
			return this;
		}
		
		
}

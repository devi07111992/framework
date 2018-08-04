package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeadOpenTapsCRM  extends Annotations {
	
	public ViewLeadOpenTapsCRM()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@class='subMenuButtonDangerous']")
	WebElement eleClickDelete;
	
	
	
	public MyLeadOpenTaps clickDelete() throws IOException
	{
		click(eleClickDelete);
		return new MyLeadOpenTaps();
	}
	
	
}

package framework;



import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateContact extends SeMethods{
	@Test
	private void Createcontact() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		WebElement username=locateElement("id", "username");
		
		//WebElement enterusername=type()

	}

}

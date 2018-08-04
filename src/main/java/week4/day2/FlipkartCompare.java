package week4.day2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class FlipkartCompare extends SeMethods {
@Test
	public void Flipkart() throws InterruptedException {
		
		startApp("chrome","https://www.flipkart.com/");
		WebElement close=locateElement("xpath","//button[text()='✕']");
		click(close);
		WebElement appliances=locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement Samsung=locateElement("xpath","(//span[text()='Samsung'])[2]");
		action(appliances,Samsung);
		WebElement min =locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingText(min,"₹25000");
		WebElement max =locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(max,"₹60000");
		WebElement screen=locateElement("xpath","//div[text()='Screen Size']");
		click(screen);
		WebElement size=locateElement("xpath","//div[text()='48 - 55']");
		
		click(size);
		WebElement firstOne=locateElement("xpath","//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(firstOne);
		switchToWindow(1);	
		//costone
		WebElement costOne=locateElement("xpath","//div[@class='_1vC4OE _3qQ9m1']");
		getText(costOne);
		WebElement compare=locateElement("xpath","//span[text()='Compare']");
		click(compare);
		closeBrowser();
		switchToWindow(0);
		WebElement second=locateElement("xpath","//div[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
		click(second);
		switchToWindow(1);
		WebElement costsecond=locateElement("xpath","//div[@class='_1vC4OE _3qQ9m1']");
		getText(costsecond);
		WebElement comparesecond=locateElement("xpath","//span[text()='Compare']");
		click(comparesecond);
		
		WebElement compaerBoth=locateElement("xpath","//span[text()='COMPARE']");
		click(compaerBoth);
		
		WebElement valueOfone=locateElement("xpath","//div[@class='_1vC4OE']");
		String one=getText(valueOfone);
		WebElement valueOfSecond=locateElement("xpath","(//div[@class='_1vC4OE'])[2]");
		String two=getText(valueOfSecond);
		
		/*//String replaceAll = two.replaceAll("\\D", "");
		String replaceAll=two.replaceAll("?","").replaceAll(",","");
		int parseInt = Integer.parseInt(replaceAll);
		//Remove the non-integer values then convert String to Interger 
		System.out.println(parseInt);
		String replace=one.replaceAll("?","").replaceAll(",","");
		int parse = Integer.parseInt(replace);
		System.out.println(parse);
		if(parseInt<=parse)
		{
			WebElement secondClick=locateElement("xpath","//a[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
			click(secondClick);
		}else
		{
			WebElement firstClick=locateElement("xpath","//a[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(firstClick);
		}
		
		WebElement buy=locateElement("xpath","//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']");
		click(buy);
*/	}
}



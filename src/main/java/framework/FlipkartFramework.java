package framework;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class FlipkartFramework extends SeMethods{
	@Test
	public void flipkart()
	{
		//Lauch the chrome browser
		startApp("chrome","https://www.flipkart.com/");
		//Close the login popup
		WebElement close=locateElement("xpath","//button[text()='✕']");
		click(close);	
		//Mouse over to TVs & Appliances
		WebElement appliances=locateElement("xpath","//span[text()='TVs & Appliances']");
		click(appliances);
		//Click on Samsung product
		WebElement samsung=locateElement("xpath","(//span[text()='Samsung'])[2]");
		click(samsung);
		//In Price filter, select min price to 25000(using dropdown)
		WebElement minAmount=locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingText(minAmount,"₹25000");
		//In Price filter, select min price to 60000,(using dropdown)
		WebElement maxAmount=locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(maxAmount,"₹60000");
		//Click on Screensize filter
		WebElement screensize=locateElement("xpath","//div[text()='Screen Size']");
		click(screensize);
	    //click filter amount
		WebElement clickvalue=locateElement("xpath","//div[text()='48 - 55']");
		click(clickvalue);
		//Click on the first product 
		WebElement firstProduct=locateElement("xpath","(//div[@class='_3wU53n'])[1]");
		click(firstProduct);
		//Switch to New window 
		switchToWindow(1);
		//Click on compare check box 
		WebElement comparecheckbox1=locateElement("xpath","//div[@class='_1p7h2j']");
		click(comparecheckbox1);
		//Close the window
		closeBrowser();
		//Switch back to parent window 
		switchToWindow(0);
		//Click on the second product 
		WebElement clickSecondProduct=locateElement("xpath","(//div[@class='_3wU53n'])[2]");
		click(clickSecondProduct);
		//Switch to New window 
		switchToWindow(1);
		//Click on compare check box 
		WebElement comparecheckbox2=locateElement("xpath","//div[@class='_1p7h2j']");
		click(comparecheckbox2);
	   //Click on compare button 
		WebElement compareButton=locateElement("xpath","//span[text()='COMPARE']");
		click(compareButton);
		//Get the price of the first product
		WebElement compareFirstAmount=locateElement("xpath","(//div[@class='_1vC4OE'])[1]");
        String firstAmount=getText(compareFirstAmount);
        WebElement compareSecondAmount=locateElement("xpath","(//div[@class='_1vC4OE'])[2]");
        String SecondAmount=getText(compareSecondAmount);
        //delecte unwanter text from amount
        String replaceFirstAmount=firstAmount.replaceAll("₹", "").replaceAll(",", "");
        int secondstring=Integer.parseInt(replaceFirstAmount);
        System.out.println(replaceFirstAmount);
        String replaceSecondAmount=SecondAmount.replaceAll("₹", "").replaceAll(",", "");
        int firststring=Integer.parseInt(replaceSecondAmount);
        System.out.println(replaceSecondAmount);
        {
			WebElement secondClick=locateElement("xpath","//a[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
			click(secondClick);
		}
        
		{
			WebElement firstClick=locateElement("xpath","//a[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(firstClick);
		}
		
		WebElement buy=locateElement("xpath","//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']");
		click(buy);
        
        
      
        
        
    
	}
	
	
	

}




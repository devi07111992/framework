package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver ;
	int i = 1;
	public static Properties prop;
	/*AnnotationWithOustatictSeMethods repo = new AnnotationWithOutSeMethods();*/
	
	public void loadObject() throws FileNotFoundException, IOException
	{
		 try {
			new Properties();
			 prop.load(new FileInputStream("./src/main/resources/Object.properties"));
			 
		} catch (FileNotFoundException e) {
			reportstep(e.getMessage(),"fail");
		}
			catch (IOException e) {
				reportstep(e.getMessage(),"fail");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	public void startApp(String browser, String url) throws IOException{
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();		
			}

			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			reportstep("Browser "+browser+" Launched successfully", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportstep("Browser "+browser+" not Launched "+e.getMessage(), "fail");

			//System.err.println("WebDriverException has occurred");
			//throw new RuntimeException();
		}catch(Exception e)
		{
			reportstep("Browser "+browser+" not Launched ", "fail");

			System.err.println("Exception is occured");
		}
		finally {
			takeSnap();
		}

		//System.out.println("The Browser "+browser+" is Launched Successfully");


	}

	public WebElement locateElement(String locator, String locValue) throws NoSuchElementException,NullPointerException {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linkText": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exception hass occurred");
		}

		return null;
	}


	public WebElement locateElement(String locValue) {

		try {
			return driver.findElementById(locValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exceptionnn has occured");
		}
		return null;
	}

	public void type(WebElement ele, String data) throws IOException  {
		try {
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportstep("The Data "+data+" is Entered Successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.err.println("sendkey values is wrong");
			reportstep("The data failed","fail");
		}finally {

			takeSnap();
		}
	}
	public void keyEnter(WebElement ele, String data) throws IOException {
		try {
			ele.sendKeys(data,Keys.ENTER);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportstep("The Data "+data+" is Entered Successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The keys is not entered");
			reportstep("The keys is not entered","fail");
		}
		finally{
			takeSnap();
		}
	}

	public void clear(WebElement ele)
	{
		try {
			ele.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeSnap();

	}
	public void WebDriverWait(WebElement ele)
	{

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void click(WebElement ele) throws IOException {
		try {
			ele.click();
			//System.out.println("The Element "+ele+" is clicked Successfully");
			reportstep("The Element "+ele+" is clicked Successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportstep("The Element "+ele+" is NOT clicked ","fail");
		}
		takeSnap();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String eleText = null;
		try {
			eleText = ele.getText();
			System.out.println(eleText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleText;

	}
	public String getTitle() {
		// TODO Auto-generated method stub
		String eleText = null;
		try {
			eleText = driver.getTitle();
			System.out.println(eleText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleText;

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			System.out.println("The dropdown "+value+ " is selected successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		takeSnap();
	}}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try {
			Select dd = new Select(ele);
			dd.selectByIndex(index);
			System.out.println("The dropdown "+index+ " is selected successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		takeSnap();
		}
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select dd = new Select(ele);
			dd.selectByValue(value);
			System.out.println("The dropdown "+value+ " is selected successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			takeSnap();
			}
	}
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean breturn = false;
		try {
			if(driver.getTitle().equals(expectedTitle))
			{
				System.out.println("The Title "+expectedTitle+ " is verified");
				breturn= true;
			}
			else
			{
				System.out.println("The Title "+expectedTitle+ " is not verified");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return breturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if(text.equals(expectedText))
		{
			System.out.println("The Firstname " +expectedText+ " is verified");
		}else
			System.out.println("The Firstname "+ expectedText+ "is not verified");



	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String eletext = ele.getText();
		if(eletext.contains(expectedText))
		{
			System.out.println("The Text "+expectedText+ " is verified");
		}
		else
		{
			System.out.println("The Text "+expectedText+ " is not verified");
		}
	}
	public String getAttribute(WebElement ele, String value) {
		// TODO Auto-generated method stub
		String eleatt=ele.getAttribute(value);
		System.out.println(eleatt);
		return eleatt;
	}
	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String eleatt=ele.getAttribute(attribute);
		if(eleatt.equals(value))
		{
			System.out.println("The attribute "+value+ " is verified");
		}else
			System.out.println("The attribute "+value+ " is NOT verified");

	}
	public void action(WebElement elesource,WebElement eletarget) {
		// TODO Auto-generated method stub
		Actions builder = new Actions(driver);
		builder.moveToElement(elesource).pause(2000);
		builder.click(eletarget).perform();
	}
	public void actionmultiple(WebElement elesource,WebElement eletarget,WebElement elethree) {
		// TODO Auto-generated method stub
		Actions builder = new Actions(driver);
		builder.moveToElement(elesource).pause(2000);
		builder.click(eletarget).pause(2000).click(elethree).perform();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

		String eleatt=ele.getAttribute(attribute);
		if(eleatt.contains(value))
		{
			System.out.println("The attribute "+value+ " is verified");
		}else {
			System.out.println("The attribute "+value+ " is verified");

		}
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		boolean check=ele.isSelected();
		System.out.println(check);
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean check=ele.isDisplayed();
		System.out.println(check);
	}

	public void switchToWindow(int index) {


		Set<String> allWindow=driver.getWindowHandles();
		List<String> listWindow= new ArrayList<String>();
		listWindow.addAll(allWindow);
		driver.switchTo().window(listWindow.get(index));
		System.out.println("The window is Switched");
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

		driver.switchTo().frame(ele);


	}
	public void switchToFrameComeOut() {
		// TODO Auto-generated method stub

		driver.switchTo().parentFrame();

	}
	public void switchToFrameDefault() {
		// TODO Auto-generated method stub

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	 public String getParentWindow()
	    {
			return null;
	    	
	    }
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alert1 = null;
		try {
			Alert alert=driver.switchTo().alert();
			alert1 = alert.getText();
			System.out.println(alert1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return alert1;	
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}
	public void clickNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

		}

	}


	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

   
	public String method(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println("The method name is :"+methodName);
		return methodName;
	}




}

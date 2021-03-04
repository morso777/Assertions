package hardAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertEquals {
	
	WebDriver driver;
	 
	//Store current project workspace location in a string variable ‘path’
	//String path = System.getProperty("user.dir”);
	     
	@BeforeTest
	public void SetDriver(){
	 
	//Mention the location of ChromeDriver in localsystem
	//System.setProperty("webdriver.chrome.driver",path+".src/test/resources/chromedriver/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();// Object is created- Chrome browser is opened
	driver.manage().window().maximize();
	 
	}
	 
	@Test
	public void verifyTitle()
	{
	driver.get("https://www.amazon.com");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("Assert passed");
	}
	 
	@AfterTest
	public void closedriver(){
	 
	//closes the browser instance
	driver.close();
	 
	}

}

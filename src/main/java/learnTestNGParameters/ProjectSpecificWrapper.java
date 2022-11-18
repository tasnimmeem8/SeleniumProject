package learnTestNGParameters;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificWrapper {
	public ChromeDriver driver;
	
	@Parameters({"url","uname","pword"})
	
	@BeforeMethod
	public void login (String url,String uname,String pword) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver ();
		driver.get(url);
		driver.findElementByCssSelector("#username").sendKeys(uname);
		driver.findElementByXPath("//input[@type='password']").sendKeys(pword);
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByXPath("//div[@id='label']").click();	
		
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}

}

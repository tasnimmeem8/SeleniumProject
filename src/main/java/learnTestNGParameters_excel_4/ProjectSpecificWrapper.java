package learnTestNGParameters_excel_4;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@AfterMethod
	public void logout () {
		driver.close();
	}
	
	@DataProvider
	public String [][]getData() throws IOException{
		
		ReadExcel re = new ReadExcel();
		return re.readExcel();
	}
}

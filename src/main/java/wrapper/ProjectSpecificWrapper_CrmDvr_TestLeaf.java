package wrapper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper_CrmDvr_TestLeaf {

	public ChromeDriver driver;

	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

	}

	@AfterMethod
	public void logout() {

		driver.close();

	}

}

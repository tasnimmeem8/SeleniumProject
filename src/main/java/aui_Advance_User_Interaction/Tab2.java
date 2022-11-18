package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys("crmsfa").perform();
		action.sendKeys(Keys.TAB).click().perform();
		driver.quit();
		

	}

}

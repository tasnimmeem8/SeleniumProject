package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElementByXPath("//input[@id='email']").sendKeys("abc");
		
		Actions act = new Actions (driver);

		act.sendKeys(Keys.TAB).sendKeys("abc").perform();
		act.sendKeys(Keys.ENTER).perform();
	    //driver.findElementByTagName("'login").click();
	
	}

}

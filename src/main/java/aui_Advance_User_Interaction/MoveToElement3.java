package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement3 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://mrbool.com/");
		WebElement hvon = driver.findElementByXPath("//a[@class='menulink']");
		Actions action = new Actions(driver);
		action.moveToElement(hvon).perform();

	}

}

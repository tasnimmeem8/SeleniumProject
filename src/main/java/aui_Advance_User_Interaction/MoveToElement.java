package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://mrbool.com/");
	
		
		Actions action = new Actions (driver);
		WebElement content = driver.findElementByXPath("//a[@class='menulink']");
		action.moveToElement(content).perform();
		driver.findElementByXPath("//a[text()='Articles']").click();
		driver.quit();
		
		
	}

}

package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://mrbool.com/");
		
		WebElement hoover = driver.findElementByXPath("//a[@class='menulink']");
		Actions action = new Actions (driver);
		action.moveToElement(hoover).perform();
		Thread.sleep(3000);
		driver.close();

	}

}

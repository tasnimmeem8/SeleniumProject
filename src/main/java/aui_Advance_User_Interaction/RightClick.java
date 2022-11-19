package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rclick = driver.findElementByXPath("//span[text()='right click me']");
		Actions act = new Actions(driver);

		act.contextClick(rclick).perform();
	}

}

package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Selectable").click();
		// driver.switchTo().frame(0);
		WebElement frm = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frm);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");

		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).click(item1).click(item2).click(item3).build().perform();

	}

}

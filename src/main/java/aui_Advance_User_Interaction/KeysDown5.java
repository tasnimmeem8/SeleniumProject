package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysDown5 {

	public ChromeDriver driver;

	@Test
	public void kdown() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));

		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");

		Actions action = new Actions(driver);
		action.click(item1).click(item2).click(item3).perform();
		action.keyDown(Keys.COMMAND).click(item3).click(item2).perform();

	}

}

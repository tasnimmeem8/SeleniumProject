package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rclick = driver.findElementByXPath("//span[text()='right click me']");
		Actions action = new Actions(driver);
		action.click(rclick).contextClick().perform();

	}

}

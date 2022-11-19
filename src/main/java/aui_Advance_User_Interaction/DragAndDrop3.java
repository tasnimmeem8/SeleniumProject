package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/");
		driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement drg = driver.findElementByXPath("//div[@id='draggable']");
		WebElement drp = driver.findElementByXPath("//div[@id='droppable']");

		Actions action = new Actions(driver);
		action.dragAndDrop(drg, drp).perform();

	}

}

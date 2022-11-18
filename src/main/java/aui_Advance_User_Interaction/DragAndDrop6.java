package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop6 {
	
	@Test
	public void draganddrop() {
		


	
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Droppable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement src = driver.findElementById("draggable");
		WebElement dst = driver.findElementById("droppable");
		Actions action = new Actions (driver);
		action.dragAndDrop(src, dst).perform();
	}

}

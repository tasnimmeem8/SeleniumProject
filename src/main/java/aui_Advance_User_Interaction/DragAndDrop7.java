package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Droppable").click();
		WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frm);
		WebElement src = driver.findElementById("draggable");
		WebElement dst = driver.findElementById("droppable");
		Actions action = new Actions (driver);
		action.dragAndDrop(src, dst).perform();

	}

}

package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Droppable']").click();
		WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frm);
		WebElement from = driver.findElementByXPath("//div[@id='draggable']");
		WebElement destination = driver.findElementByXPath("//div[@id='droppable']");
		Actions action = new Actions (driver);
		action.dragAndDrop(from, destination).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

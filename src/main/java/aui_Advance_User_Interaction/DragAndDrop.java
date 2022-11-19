package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Droppable']").click();

		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));

		WebElement from = driver.findElementByXPath("//div[@id='draggable']");
		WebElement to = driver.findElementByXPath("//div[@id='droppable']");

		Actions action = new Actions(driver);

		action.dragAndDrop(from, to).build().perform();
	}

}

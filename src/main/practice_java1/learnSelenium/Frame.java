package learnSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/");
		
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}
		
	
	@Test (priority=0)
	public void selectable() {
		driver.findElementByLinkText("Selectable").click();
		WebElement frm = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frm);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		Actions action = new Actions (driver);
		action.keyDown(Keys.COMMAND).click(item1).click(item2).perform();
	}
	
	@Test (priority = 1)
	public void dragAndDrop() {
		driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(0);
		WebElement from = driver.findElementById("draggable");
		WebElement to = driver.findElementById("droppable");
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		
	}
	
	@Test (priority = 2)
	public void sortable() {
		driver.findElementByLinkText("Sortable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement item1 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[1]");
		WebElement item2 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[2]");
		WebElement item3 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[3]");
		WebElement item4 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[4]");
		WebElement item5 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[5]");
		WebElement item6 = driver.findElementByXPath("(//ul[@id='sortable']/li/span)[6]");
		Actions action = new Actions(driver);
		action.dragAndDrop(item1, item5).dragAndDrop(item4, item2).dragAndDrop(item5, item3).dragAndDrop(item1, item6).perform();
		
	}
	
	

}

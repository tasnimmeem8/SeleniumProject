package frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_iframe1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElementByLinkText("Droppable").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Droppable")));
		//WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		//driver.switchTo().frame(frm);
		
		//driver.switchTo().frame(0);
		
         driver.switchTo().frame(driver.findElementByCssSelector(".demo-frame"));
         
         WebElement src = driver.findElementById("draggable");
         WebElement dst = driver.findElementById("droppable");
         
         Actions action = new Actions (driver);
         action.dragAndDrop(src, dst).perform();
         
         
         
         driver.switchTo().defaultContent();
     
	}

}

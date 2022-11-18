package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Selectable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));	
		WebElement item1 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[1]");
		WebElement item2 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[2]");
		WebElement item3 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[3]");
		WebElement item4 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[4]");
		WebElement item5 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[5]");
		WebElement item6 = driver.findElementByXPath("(//ol[@class='ui-selectable']/li)[6]");
		
		
		Actions action = new Actions (driver);
	
		action.sendKeys(Keys.CONTROL).click(item1).click(item3).click(item5).click(item2).click(item4).click(item6).perform();
		driver.switchTo().parentFrame();
		driver.findElementByLinkText("Demos").click();
		Thread.sleep(3000);
		driver.quit();

	}

}

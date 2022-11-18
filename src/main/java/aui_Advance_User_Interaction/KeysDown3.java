package aui_Advance_User_Interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown3 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Selectable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class=\"demo-frame\"]"));
		WebElement item1 = driver.findElementByXPath("(//ol[@id='selectable']/li)[1]");
		WebElement item2 = driver.findElementByXPath("(//ol[@id='selectable']/li)[2]");
		WebElement item3 = driver.findElementByXPath("(//ol[@id='selectable']/li)[3]");
		WebElement item4 = driver.findElementByXPath("(//ol[@id='selectable']/li)[4]");
		WebElement item5 = driver.findElementByXPath("(//ol[@id='selectable']/li)[5]");
		WebElement item6 = driver.findElementByXPath("(//ol[@id='selectable']/li)[6]");
		
		
		Actions action = new Actions (driver);
		action.keyDown(Keys.COMMAND).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).perform();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Demos").click();
		driver.quit();
		
		
	}

}

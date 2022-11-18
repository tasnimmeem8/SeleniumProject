package aui_Advance_User_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown {

	public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver(); 
				
				driver.get("https://jqueryui.com/selectable/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//switch to frame
				driver.switchTo().frame(0);
				
				WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
				//WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
				WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
				
				WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
				
				
				Actions action = new Actions(driver);
				Thread.sleep(3000);
				//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).perform();
				
				//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).release().perform();
					action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).release().perform();
				
			}

	}



package aui_Advance_User_Interaction;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable1 {

//	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://jqueryui.com/");
	    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.findElementByLinkText("Sortable").click();
		driver.switchTo().frame(0);
	    WebElement item1 = driver.findElementByXPath("//ul[@class='ui-sortable']/li");
		WebElement item2 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[2]");
		WebElement item3 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[3]");
		WebElement item4 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[4]");
		WebElement item5 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[5]");
		WebElement item6 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[6]");
		
		Actions action = new Actions (driver);
		Thread.sleep(3000);
		
		action.dragAndDrop(item5, item1).perform();
		action.dragAndDrop(item4, item2).perform();
		action.dragAndDrop(item3, item6).perform();
	
		Thread.sleep(3000);
		driver.quit();

		
	}

}

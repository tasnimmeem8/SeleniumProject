package aui_Advance_User_Interaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sortable").click();
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//ul[@class='ui-sortable']/li");
		WebElement item2 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[2]");
		WebElement item3 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[3]");
		WebElement item4 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[4]");
		WebElement item5 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[5]");
		WebElement item6 = driver.findElementByXPath("(//ul[@class='ui-sortable']/li)[6]");

		Actions action = new Actions(driver);
		Thread.sleep(3000);

		action.clickAndHold(item6).moveToElement(item4).perform();
		action.clickAndHold(item5).moveToElement(item3).perform();
		action.clickAndHold(item2).moveToElement(item1).perform();

		Thread.sleep(3000);
		driver.close();

	}

}

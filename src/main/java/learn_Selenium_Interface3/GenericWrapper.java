package learn_Selenium_Interface3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{

	public ChromeDriver driver;
	
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void enterById(String locator, String data) {
		driver.findElementById(locator).sendKeys(data);
		
	}

	public void enterByXpath(String locator, String data) {
		driver.findElementByXPath(locator).sendKeys(data);
		
	}

	public void enterByClass(String locator, String data) {
		driver.findElementByClassName(locator).sendKeys(data);
		
	}

	public void clickById(String locator) {
		driver.findElementById(locator).click();
		
	}

	public void clickByXpath(String locator) {
		driver.findElementByXPath(locator).click();
		
	}

	public void ChooseVisibleTextById(String locator, String text) {
		WebElement ele = driver.findElementById(locator);
		Select dd = new Select(ele);
		dd.selectByVisibleText(text);
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickByLinkText(String locator) {
		driver.findElementByLinkText(locator).click();
		
	}

}

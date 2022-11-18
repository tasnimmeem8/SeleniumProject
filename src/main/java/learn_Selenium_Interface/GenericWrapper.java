package learn_Selenium_Interface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{
	
	public ChromeDriver driver;

	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);	
	}

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);	
	}

	public void enterByClass(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);	
	}

	public void enterByCSS(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);
	}

	public void clickById(String locatorValue) {
		driver.findElementById(locatorValue).click();	
	}
	public void chooseByIdText(String locatorValue, String data) {
		WebElement ele = driver.findElementById(locatorValue);
		Select dd = new Select(ele);
		dd.selectByVisibleText(data);	
	}

	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
	}

	public void clickByClass(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
	}

	public void clickByCSS(String locatorValue) {
		driver.findElementByCssSelector(locatorValue).click();
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

}

			
		
		
	

	


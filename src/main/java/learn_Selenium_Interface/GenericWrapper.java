package learn_Selenium_Interface;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper implements WrapperMethods {

	public WebDriver driver;
	

	public void login(String url) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	}

	public void enterById(String locatorValue, String data) {
		driver.findElement(By.id(locatorValue)).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElement(By.name(locatorValue)).sendKeys(data);
	}

	public void enterByClass(String locatorValue, String data) {
		driver.findElement(By.className(locatorValue)).sendKeys(data);
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElement(By.xpath(locatorValue)).sendKeys(data);
	}

	public void enterByCSS(String locatorValue, String data) {
		driver.findElement(By.cssSelector(locatorValue)).sendKeys(data);
	}

	public void clickById(String locatorValue) {
		driver.findElement(By.id(locatorValue)).click();
	}

	public void chooseByIdText(String locatorValue, String data) {
		WebElement ele = driver.findElement(By.id(locatorValue));
		Select dd = new Select(ele);
		dd.selectByVisibleText(data);
	}

	public void clickByName(String locatorValue) {
		driver.findElement(By.name(locatorValue)).click();
	}

	public void clickByClass(String locatorValue) {
		driver.findElement(By.className(locatorValue)).click();
	}

	public void clickByXpath(String locatorValue) {
		driver.findElement(By.xpath(locatorValue)).click();
	}

	public void clickByCSS(String locatorValue) {
		driver.findElement(By.cssSelector(locatorValue)).click();
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElement(By.linkText(locatorValue)).click();

	}
	@DataProvider
	public String[][]getData() throws IOException{
		Excel re= new Excel();
		return re.readExcel();
	}
}



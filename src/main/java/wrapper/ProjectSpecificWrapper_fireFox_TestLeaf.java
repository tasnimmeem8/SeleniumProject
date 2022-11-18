package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificWrapper_fireFox_TestLeaf {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys("crmsfa").perform();
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.cssSelector("#button")).click();
		
	}
	
	@AfterMethod
	public void logOut() {
		driver.quit();
	}
	
}

		
	
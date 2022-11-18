package wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjecSpecificWrapper_Edge_TestLeaf {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.cssSelector("input[name='USERNAME']")).sendKeys("DemoSalesManager");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("crmsfa");
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.cssSelector("img[onmouseover*='integratingweb']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}

}

package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLeaf1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
	  //  driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    driver.findElement(By.cssSelector(".crmsfa>a>img")).click();
	    
	}
	
	@AfterMethod
	public void logout() {
		driver.close();
	}
	
	@Test
	public void creatLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	
	
	
	
	
	
	

}

package learnTestNGParameters_excel_1;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpesificWrapper{
	
	public ChromeDriver driver;
	
    @Parameters({"url","un","pw"})
	
	@BeforeMethod
	public void login (String url, String un, String pw) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(un);
		driver.findElementById("password").sendKeys(pw);
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}
	
	@DataProvider
	public String[][]getData() throws IOException {
		Read_Excel re = new Read_Excel();
		return re.readExcel();
	}

}


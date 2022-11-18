package testPeramitars_DataProvider_excel;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;
	
	@Parameters({"url","un","pw"})
	
	@BeforeMethod
	public void login(String url, String un, String pw) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	    driver.findElementById("username").sendKeys(un);
	    driver.findElementById("password").sendKeys(pw);
	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
	    driver.findElementByLinkText("CRM/SFA").click();
	    
	    File src = driver.getScreenshotAs(OutputType.FILE);
	    File dst = new File("./snap/img6.png");
	    FileUtils.copyFile(src, dst);
	}
	
	@AfterMethod
	public void logout() {
		driver.close();
	}
	
	@SuppressWarnings("static-access")
	@DataProvider
	public String[][]getData() throws IOException{
		

		ReadExcel re = new ReadExcel();
	    return re.readExcel1();
		
	}

}

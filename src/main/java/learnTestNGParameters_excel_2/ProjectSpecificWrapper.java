package learnTestNGParameters_excel_2;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {
	public ChromeDriver driver;
	
	
	@Parameters({"url","un","pw"})

	@BeforeMethod
	public void login(String url, String un, String pw) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(un);
		driver.findElementById("password").sendKeys(pw);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		
	}
	
	@AfterMethod
	public void logout() {
		driver.close();
	}
	
	@DataProvider
	public String[][]getData() throws IOException{
		Read_Excel re = new Read_Excel();
		return re.readData();
	}

}

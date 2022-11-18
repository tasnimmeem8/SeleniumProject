package learnTestNGParameters_excel;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils_Excel.ReadExcel2;




public class ProjectSpecificWrapper1 {
		
		public ChromeDriver driver;
		
		@Parameters({"url","un","pw"})
	
		@BeforeMethod
		public void login(String url,String un,String pw) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver ();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElementById("username").sendKeys(un);
			driver.findElementById("password").sendKeys(pw);
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CRM/SFA")));
			
			
		}

		@AfterMethod
		public void logout() {
		
		driver.close();
	}
		
		@SuppressWarnings("static-access")
		@DataProvider
		public String[][] getdata1() throws IOException {
			
			ReadExcel2 re = new ReadExcel2();
			return re.readExcel2();
			
	
		}	
}

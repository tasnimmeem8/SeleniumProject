package learnTestNGParameters_excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils_Excel.ReadExcel3;

public class ProjectSpecificWrapper2 {
	public ChromeDriver driver;

	@Parameters({ "url", "un", "pw" })

	@BeforeTest
	public void login(String url, String un, String pw) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(un);
		driver.findElementById("password").sendKeys(pw);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByPartialLinkText("CRM/SFA").click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CRM/SFA")));
	}

	@AfterTest
	public void logout() {
		driver.close();
	}

	@SuppressWarnings("static-access")
	@DataProvider
	public String[][] getdata2() throws IOException {

		ReadExcel3 re = new ReadExcel3();
		return re.readExcel3();

	}

}

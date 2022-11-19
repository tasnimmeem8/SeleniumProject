package learnTestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLeaf {
	public ChromeDriver driver;

	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByCssSelector(".top>label+input").sendKeys("DemoSalesManager");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("crmsfa").perform();
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByCssSelector(".crmsfa>a>img").click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void logOut() {
		driver.quit();
	}

	@Test(priority = 2)
	public void CreatLead() {
		driver.findElementByXPath("//a[contains(text(),'Crea')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Mali");

		WebElement sou1 = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(sou1);
		dd.selectByVisibleText("Direct Mail");

		WebElement mar1 = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select dd2 = new Select(mar1);
		dd2.selectByVisibleText("Automobile");

		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Ma");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Mrs.");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Math");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("200,000");

		WebElement cur1 = driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select dd3 = new Select(cur1);
		dd3.selectByVisibleText("AOK - Angolan Kwanza");

		WebElement ind1 = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select dd4 = new Select(ind1);
		dd4.selectByVisibleText("Computer Hardware");

		WebElement own1 = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select dd5 = new Select(own1);
		dd5.selectByVisibleText("Partnership");

		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Need funds");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("N/A");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("11");

		driver.findElementByCssSelector(".smallSubmit").click();

		String tl = driver.getTitle();
		System.out.println("View Lead Page Title= " + tl);
		if (tl.contains("View")) {
			System.out.println("Verification successful ");
		} else {
			System.out.println("Verification failed");
		}

		driver.findElementByCssSelector(".subMenuButtonDangerous").click();

	}

	@Test(priority = 1)
	public void CreateAccount() {
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Checking Account");
		driver.findElementById("groupNameLocal").sendKeys("Checking");
		driver.findElementById("annualRevenue").sendKeys("32000");

		WebElement cur2 = driver.findElementById("currencyUomId");
		Select dd6 = new Select(cur2);
		dd6.selectByVisibleText("USD - United States Dollar");

		WebElement ind2 = driver.findElementByXPath("//select[@name='industryEnumId']");
		Select dd7 = new Select(ind2);
		dd7.selectByVisibleText("Computer Software");

	}

}

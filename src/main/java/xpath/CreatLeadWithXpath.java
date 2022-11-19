package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadWithXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'C')]").click();
		driver.findElementByXPath("//a[contains(text(),'Crea')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Mali");

		WebElement path = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(path);
		dd.selectByVisibleText("Direct Mail");

		WebElement path2 = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select dd2 = new Select(path2);
		dd2.selectByVisibleText("Automobile");

		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Ma");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Mrs.");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Math");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("200,000");

		WebElement path3 = driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select dd3 = new Select(path3);
		dd3.selectByVisibleText("AOK - Angolan Kwanza");

		WebElement path4 = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select dd4 = new Select(path4);
		dd4.selectByVisibleText("Computer Hardware");

		WebElement path5 = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select dd5 = new Select(path5);
		dd5.selectByVisibleText("Partnership");

		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Need funds");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("N/A");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("11");
		driver.quit();

	}

}
package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafCreatLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	
	driver.manage().window().maximize();

	
	driver.get("http://leaftaps.com/opentaps/control/main");

	
	System.out.println(driver.getTitle());
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	
    File src = driver.getScreenshotAs(OutputType.FILE);
    File dst = new File ("./snap/img5.png");
	FileUtils.copyFile(src, dst);
	
	driver.findElementById("createLeadForm_companyName").sendKeys("MVB");
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	WebElement src1 = driver.findElementById("createLeadForm_dataSourceId");
	Select dd = new Select(src1);
	dd.selectByVisibleText("Conference");
	WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
	Select dd2 = new Select (mkt);
	dd2.selectByVisibleText("Automobile");
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hema");
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Mali");
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("2,000");
	WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
	Select dd3 = new Select (ind);
	dd3.selectByVisibleText("Computer Hardware");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
	WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");
	Select dd4 = new Select(own);
	dd4.selectByVisibleText("Partnership");
	WebElement curr = driver.findElementById("createLeadForm_currencyUomId");
	Select dd5 = new Select (curr);
	dd5.selectByVisibleText("BDT - Bangladesh Taka");
	driver.findElementById("createLeadForm_sicCode").sendKeys("3215");
	driver.findElementById("createLeadForm_description").sendKeys("Contract should be signed for 3years, if not will not assigned");
	driver.findElementById("createLeadForm_importantNote").sendKeys("Have to take responsibility of her own, also have to take care of the team");
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("001");
	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("313");
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123-456");
	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("512");
	driver.findElementById("createLeadForm_generalToName").sendKeys("Hema Mali");
	driver.findElementById("createLeadForm_generalAttnName").sendKeys("Hema Mali");
    driver.findElementById("createLeadForm_generalCity").sendKeys("Detroit");
    WebElement st = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	Select dd6 = new Select(st);
	dd6.selectByVisibleText("Michigan");
	WebElement cnt = driver.findElementById("createLeadForm_generalCountryGeoId");
	Select dd7 = new Select (cnt);
	dd7.selectByVisibleText("United States");
	driver.findElementByClassName("smallSubmit").click();
	
	File src2 = driver.getScreenshotAs(OutputType.FILE);
	File dst2 = new File("C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\snap\\img12.png");
	FileUtils.copyFile(src2, dst2);
	
    driver.findElementByClassName("subMenuButtonDangerous").click();
    Thread.sleep(3000);
    driver.close();
		
		
	}
}

package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafHomeWork {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
	//Class object=new Class();   (Create Object)
	ChromeDriver driver = new ChromeDriver();
	
	//Action- Launch the browser,Value- Load URL
    driver.get("http://leaftaps.com/opentaps/control/main");
	//Action-Enter user name,Value-DemosSalesManager
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//Action-Enter Password, Value- crmsfa
	driver.findElementById("password").sendKeys("crmsfa");
	//Action-Click login
	driver.findElementByClassName("decorativeSubmit").click();
	//Action -Click crm/sfa link
	driver.findElementByLinkText("CRM/SFA").click();
	//Action- Click Create Leads link
	driver.findElementByLinkText("Create Lead").click();
	//Action- Enter Company name, Value- TCS
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	//Action- Enter First name, Value- Hema
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	//Action- Enter last name, Value- Mali
	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	//Action-Choose Source, Value- choose any value
    WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	Select dd=new Select(src);
	dd.selectByVisibleText("Conference");
	//Action- Enter title, Value-Ms.
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
	//Action-Choose Industry, Value- Choose any value
	WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
	Select dd2=new Select (ind);
	dd2.selectByVisibleText("Finance");
	//Action-Choose Ownership, Value- Choose any value
	WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");
	Select dd3=new Select (own);
	dd3.selectByVisibleText("Partnership");
	//Action-Enter Description, Value-TCS
	driver.findElementById("createLeadForm_description").sendKeys("TCS");
	//Action- Enter Country Code, Value- 1
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	//Action-Enter Area code, Value- 682
	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("682");
	//Action- Enter Department , Value- MKT
	driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
	//Action- Enter Number of employees, Value-100
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
	//Action- Enter web URL, Value- google.com
	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
	//Action- Enter City
	driver.findElementById("createLeadForm_generalCity").sendKeys("Detroit");
	//Action- Choose State/Province, Value- Choose any value
	WebElement sp = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	Select dd4=new Select (sp);
	dd4.selectByVisibleText("Michigan");
	//Action-Choose Country, Value - Choose any value
	WebElement cnt = driver.findElementById("createLeadForm_generalCountryGeoId");
	Select dd5=new Select (cnt);
	dd5.selectByVisibleText("United States");
	//Action-Enter zip code, Value- 75061
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
	//Action-Choose Marketing Campaign, Value- Any value
	WebElement mkc = driver.findElementById("createLeadForm_marketingCampaignId");
	Select dd6=new Select (mkc);
	dd6.selectByVisibleText("Automobile");
	//Action- Enter phone Number, Value- 1234567890
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
	//Action- Enter email address, Value- abc@gmail.com
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
	//Action-Click create lead
	driver.findElementByName("submitButton").click();
	//Action-verify the first name, value- not Covered
	}

}
 
package learnTestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatLead {
	
		@Test
		public void createLead() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			// WebDriverManager.firefoxdriver().setup();
		
			ChromeDriver driver = new ChromeDriver();

			// maximize
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			// load URL
			driver.get("http://leaftaps.com/opentaps");

			// Enter Username - (Element level)
			driver.findElementById("username").sendKeys("DemoSalesManager");

			// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			// Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();

			// click leads
			driver.findElementByLinkText("Leads").click();
			

			// click create lead link

			driver.findElementByLinkText("Create Lead").click();

			// company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

			// enter firstName
			
			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Gopi");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new RuntimeException();

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("J");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");

			// enter firstName local
			driver.findElementByCssSelector("input#createLeadForm_firstNameLocal").sendKeys("Gopi");
			// driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Gopi");

			// enter lastName local
			driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Jayakumar");

			// enter salutation
			driver.findElementByXPath("//input[@name='personalTitle']").sendKeys("Mr.");

			// Choose source
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");

			// enter Title
			driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("Mr.");

			// enter Annual revenue
			driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1000");

			// choose industry
			WebElement element = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(element);
			dd1.selectByVisibleText("Insurance");

			// choose ownership
			WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");

			// enter Sic code
			driver.findElementByXPath("//input[@name='sicCode']").sendKeys("1010");

			// enter description
			driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software Development company");

			// enter important note(using CssSelector)
			driver.findElementByCssSelector("textarea#createLeadForm_importantNote").sendKeys("It's a trusted company");
			// driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("It's
			// a trusted company");

			// enter country code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("0088");

			// enter area code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("682");
			
			//enter phone number
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("2084048");;

			// enter extension
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("101");

			// enter department
			driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");

			// choose preferred currency(dropdown)

			WebElement ele1 = driver.findElementById("createLeadForm_currencyUomId");
			Select dd3 = new Select(ele1);
			dd3.selectByVisibleText("BDT - Bangladesh Taka");

			// enter number of employees
			driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("1000");

			// enter Ticker symbol
			driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Tk");

			// Enter Person to Ask For
			driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("Gopi");

			// Enter Web Url
			driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("www.google.com");

			// Enter To Name
			driver.findElementByXPath("//input[@name='generalToName']").sendKeys("Gnath");

			// Enter Address Line 1 and 2
			driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("8821 Saddlehorn Dr");
			// address line 2
			driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("APT 252");

			// Enter City
			driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("DAL");

			// Chose State/Province
			WebElement element3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select dd4 = new Select(element3);
			dd4.selectByVisibleText("Texas");

			// Choose Country
			WebElement element4 = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dd5 = new Select(element4);
			dd5.selectByVisibleText("Bangladesh");

			// Enter Zip/Postal Code
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

			// Enter Zip/Postal Code Extension
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("111");

			// Choose Marketing Campaign
			WebElement element5 = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd6 = new Select(element5);
			dd6.selectByVisibleText("Car and Driver");

			// Enter phone number
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("682-207-3636");

			// Enter email address
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("mrc_77@gmail.com");

			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();

			// Verify the first name(for verifying first name, we use getText() and stored
			// the value in firstName and print)

			String firstName = driver.findElementById("viewLead_firstName_sp").getText();
			System.out.println(firstName);
			
			System.out.println("Element not found");

			if (firstName.equals("Gopi")) {
				System.out.println("Name is Matched");
			} else {
				System.out.println("Not Match");
			}
			driver.close();
		}
	}


package css_Selector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		System.out.println("Window Handle= " + driver.getWindowHandle());
		System.out.println("Page Title= " + driver.getTitle());
		System.out.println("Title Length= " + driver.getTitle().length());
		driver.getTitle().contains("Leaf");
		System.out.println("Contain Leaf= " + driver.getTitle().contains("Leaf"));
		System.out.println("Page Title in Upper Case= " + driver.getTitle().toUpperCase());
		System.out.println("Page Title in Lower Case= " + driver.getTitle().toLowerCase());

		driver.manage().window().maximize();

		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("#password").sendKeys("crmsfa");
		driver.findElementByCssSelector(".decorativeSubmit").click();
		driver.findElementByCssSelector("#label>a").click();
		driver.findElementByCssSelector(".shortcuts>li>a").click();

		System.out.println("                    ");
		System.out.println("Current page Title = " + driver.getTitle());

		driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
		driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");

		WebElement src = driver.findElementByCssSelector("select[name='dataSourceId']");
		Select dd = new Select(src);
		dd.selectByVisibleText("Conference");

		WebElement mrk = driver.findElementByCssSelector("select[name='marketingCampaignId']");
		Select dd2 = new Select(mrk);
		dd2.selectByVisibleText("Automobile");

		driver.findElementByCssSelector("#createLeadForm_firstNameLocal").sendKeys("Hema");
		driver.findElementByCssSelector("input[name='lastNameLocal']").sendKeys("Mali");
		driver.findElementByCssSelector("input[name='generalProfTitle']").sendKeys("Mrs.");
		driver.findElementByCssSelector("#createLeadForm_annualRevenue").sendKeys("2000");

		WebElement cur = driver.findElementByCssSelector("#createLeadForm_currencyUomId");
		Select dd3 = new Select(cur);
		dd3.selectByVisibleText("USD - American Dollar");

		WebElement ind = driver.findElementByCssSelector("select[name='industryEnumId']");
		Select dd4 = new Select(ind);
		dd4.selectByVisibleText("Insurance");

		driver.findElementByCssSelector("input[name='numberEmployees']").sendKeys("100");

		WebElement own = driver.findElementByCssSelector("select[name='ownershipEnumId']");
		Select dd5 = new Select(own);
		dd5.selectByVisibleText("S-Corporation");

		driver.findElementByCssSelector("#createLeadForm_description").sendKeys("TCS");
		driver.findElementByCssSelector("#createLeadForm_importantNote").sendKeys("N/A");
		driver.findElementByCssSelector("input[value='1']").sendKeys("1");
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys("123");
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneExtension").sendKeys("111");
		driver.findElementByCssSelector("#createLeadForm_departmentName").sendKeys("MKT");
		driver.findElementByCssSelector("#createLeadForm_primaryWebUrl").sendKeys("google.com");
		driver.findElementByCssSelector("#createLeadForm_generalCity").sendKeys("Detroit");

		WebElement st = driver.findElementByCssSelector("select[name='generalStateProvinceGeoId']");
		Select dd6 = new Select(st);
		dd6.selectByVisibleText("Michigan");

		WebElement cnt = driver.findElementByCssSelector("select[id$='generalCountryGeoId']");
		Select dd7 = new Select(cnt);
		dd7.selectByVisibleText("United States");

		System.out.println("              ");
		List<WebElement> tag = driver.findElementsByTagName("a");
		System.out.println("a tag in total= " + tag.size());
		List<WebElement> tag1 = driver.findElementsByTagName("input");
		System.out.println("input tag in total= " + tag1.size());
		List<WebElement> tag2 = driver.findElementsByTagName("Select");
		System.out.println("Select tag in total= " + tag2.size());

		driver.findElementByCssSelector("#createLeadForm_generalPostalCode").sendKeys("75061");
		driver.findElementByCssSelector("input[id$='primaryPhoneNumber']").sendKeys("123456");
		driver.findElementByCssSelector("input[id$='primaryEmail']").sendKeys("abc@gmail.com");
		driver.findElementByCssSelector("input[value='Create Lead']").click();

		System.out.println("              ");
		List<WebElement> tag3 = driver.findElementsByTagName("a");
		System.out.println("a tag in total= " + tag3.size());
		List<WebElement> tag4 = driver.findElementsByTagName("input");
		System.out.println("input tag in total= " + tag4.size());
		List<WebElement> tag5 = driver.findElementsByTagName("Select");
		System.out.println("Select tag in total= " + tag5.size());

		System.out.println("             ");

		System.out.println("Current Url= " + driver.getCurrentUrl());
		System.out.println("Window Handle= " + driver.getWindowHandle());

		System.out.println("                     ");

		System.out.println("Current page Title= " + driver.getTitle());

		WebElement FstName = driver.findElementByCssSelector("#viewLead_firstName_sp");
		System.out.println("Verify First name= " + FstName.getText());

		WebElement LstName = driver.findElementByCssSelector("#viewLead_lastName_sp");
		System.out.println("Verify Last Name= " + LstName.getText());

		Thread.sleep(3000);

		driver.findElementByCssSelector(".subMenuButtonDangerous").click();
		Thread.sleep(3000);
		driver.quit();

	}

}

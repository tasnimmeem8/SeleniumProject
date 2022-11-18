package testCases_LeafTap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreatLead1 {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//*[@id=\"username\"]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("crmsfa");
		driver.findElementByXPath("//*[@id=\"login\"]/p[3]/input").click();
		driver.findElementByLinkText("CRM/SFA").click();
		try{driver.findElementByLinkText("Create Lea").click();
		}catch(Exception e) {System.err.println("Creat Lead button not clickable");
		}
		
		
		
        WebElement element = driver.findElementById("createLeadForm_dataSourceId");
        Select dd = new Select (element);
        dd.selectByVisibleText("Self Generated");

	}

}

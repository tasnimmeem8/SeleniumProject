package testCases_LeafTap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLead3 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver ();
	    
	    driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	    driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	    driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	    driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	    driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	    driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
	    WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select (src);
	    dd.selectByVisibleText("Public Relations");
	   
	   

	   
	}

}

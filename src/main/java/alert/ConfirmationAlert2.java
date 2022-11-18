package alert;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert2 {

	public static void main(String[] args) throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver ();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByLinkText("CRM/SFA").click();
    driver.findElementByLinkText("Leads").click();
    driver.findElementByLinkText("Merge Leads").click();
    driver.findElementByLinkText("Merge").click();
    Thread.sleep(3000);
	String Conformation = driver.switchTo().alert().getText();	
	System.out.println(Conformation);
	//driver.switchTo().alert().accept();	
	driver.switchTo().alert().dismiss();	
    Thread.sleep(3000);
    driver.close();
	
	
	
	
	
	}

}

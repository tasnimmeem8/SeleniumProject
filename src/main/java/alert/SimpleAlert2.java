package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert2 {



	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();		
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.findElementById("username").sendKeys("DemoSalesManager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText ("Create Lead").click();
        driver.findElementByLinkText ("Merge Leads").click();
        driver.findElementByLinkText ("Merge").click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
        
        
        
        
        
        
        
	}

}

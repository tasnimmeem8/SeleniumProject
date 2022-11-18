package testCases_LeafTap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatLead2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver ();

		
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.getTitle();
	    System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        
        
        
        driver.findElement( By.xpath("//*[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.xpath("(//a[starts-with(@id,'ext')])[3]")).click();
		driver.findElement(By.linkText("My Leads")).click();
		driver.findElement(By.xpath("//a[text()='My Leads']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[starts-with(@id,'ext')])[3]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[starts-with(@id,'ext-gen')])[10]")).click();
		
		
		
		
		
		
		
		

	
	}

}

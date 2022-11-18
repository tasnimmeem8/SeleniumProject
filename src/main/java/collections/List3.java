package collections;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List3 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
	
		System.out.println(list.size());
		
		

	}

}

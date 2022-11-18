package collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class List2 {

	public static void main(String[] args) {
		
			
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/main");
			
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("(//input)[2]")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				

			   // List<WebElement> scr = driver.findElements(By.tagName("script"));
				
			//   List element= driver.findElements(By.tagName("a"));
			//	int total = element.size();

			//	System.out.println(total);
		//		System.out.println("Total Webelements starting with TagName 'a':" + total);

				
			//	System.out.println(scr.size());
				driver.quit();

			

		

	}

}

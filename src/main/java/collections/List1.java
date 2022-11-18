package collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List1 {

	public static void main(String[] args) {
	
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver ();
				
				driver.navigate().to("http://leaftaps.com/opentaps/control/main");
				
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				
				List<WebElement> linkTag = driver.findElementsByTagName("a");
			
				System.out.println(linkTag.size());

			
				driver.close();
			
	}

		

	}



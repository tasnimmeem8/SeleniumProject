package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		//direct way to find the element
		//Using the whole path , starts from HTML
		//disadvantage ,if there are any changes made in the path of the element, XPath failed.
		//begins with the single forward slash(/) 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[2]/input").sendKeys("crmsfa");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[3]/input").click();
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/div/div/a").click();
		driver.findElementByXPath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[1]/a").click();
		driver.findElementByXPath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[1]/a").click();
		
		driver.quit();
		
		
		
	}

}

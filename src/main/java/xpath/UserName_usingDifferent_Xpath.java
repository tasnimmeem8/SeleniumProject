package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class UserName_usingDifferent_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		// AttributeBase
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("DemoSalesManager");
		// Partial Attribute
		driver.findElementByXPath("//input[contains(@class,'input')]").sendKeys("DemoSalesManager");
		// partial Attribute with collection
		driver.findElementByXPath("(//input[contains(@class,'input')])[1]").sendKeys("DemoSalesManager");
		// parentToChild
		driver.findElementByXPath("//p[@class='top']/input").sendKeys("DemoSalesManager");
		// Absolute
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");

	}

}

package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class PartialAttributeXpath {

	public static void main(String[] args) {

		// tagname[contains(@attribute,'partialValue')]

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@id,'p')]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'d')]").click();
		driver.findElementByXPath("//a[contains(text(),'C')]").click();

		driver.quit();

	}

}

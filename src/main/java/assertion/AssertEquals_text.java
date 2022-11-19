package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_text {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		String text = driver.findElementByXPath("//label[text()='Username']").getText();

		Assert.assertEquals(text, "Username");

		if (text.equals("Username")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// String text =
		// driver.findElementByXPath("//label[text()='Username']").getText();

		/*
		 * Assert.assertEquals(text, "Username");
		 * 
		 * if (text.equals("Username")) { System.out.println("UserName text displayed");
		 * }else { System.out.println("UserName text not displayed"); }
		 */
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();

		driver.quit();
	}

}

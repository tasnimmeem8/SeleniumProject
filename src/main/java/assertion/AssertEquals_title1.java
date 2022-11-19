package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_title1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");

		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		String text = driver.findElementByXPath("//p[@class='top']/label").getText();
		System.out.println(text);
		Assert.assertEquals(text, "Username");

		if (text.equals("Username")) {
			System.out.println("Username visible");
		} else {
			System.out.println("Username not visible");
		}

	}

}

package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_true3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		driver.findElementByXPath("//div[@class='remember-info']/input").click();
		boolean checked = driver.findElementByXPath("//div[@class='remember-info']/input").isSelected();
		Assert.assertTrue(checked, "is checked");
		if (checked == true) {
			System.out.println("checked");
		} else {
			System.out.println("Not checked");
		}

	}

}

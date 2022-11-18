package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_IsEnabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		boolean enabled = driver.findElementByCssSelector("input[class='cs-remID']").isEnabled();
		
		if (enabled==true) {
			System.out.println("is enabled");
		}else {
			System.out.println("is not enabled");
		}
		
		driver.quit();
	}

}

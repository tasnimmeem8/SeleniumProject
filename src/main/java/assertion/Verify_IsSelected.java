package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_IsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		driver.findElementByCssSelector("input[class='cs-remID']").click();
		
		boolean checked = driver.findElementByCssSelector("input[class='cs-remID']").isSelected();
		
		if (checked==true) {
			System.out.println("is checked");
		}else {
			System.out.println("is not ckecked");
		}
		// driver.quit();
	
	}

}

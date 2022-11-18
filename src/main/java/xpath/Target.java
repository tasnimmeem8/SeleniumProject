package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.target.com/");

		driver.findElementByXPath("(//a[contains(@class,'down')])[1]").click();
	}

}

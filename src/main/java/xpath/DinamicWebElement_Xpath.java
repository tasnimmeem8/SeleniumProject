package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicWebElement_Xpath {

	public static void main(String[] args) {

		// tagname[starts-with(@attribute,’start value of attribute’)]

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.prothomalo.com");
		driver.findElementByXPath("(//div[starts-with(@class,'hamburger')])[2]").click();
		driver.findElementByXPath("(//span[starts-with(@class,'he')])[5]").click();

		driver.quit();

	}

}

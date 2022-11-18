package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicWebElement_Contains_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.target.com/");

		driver.findElementByXPath("//a[contains(@class,'down')]").click();
		driver.findElementByXPath("(//span[contains(@class,'hoVCbd')])[2]").click();
		driver.findElementByXPath("(//a[contains(@class,'down')])[2]").click();
		driver.close();
	}

}

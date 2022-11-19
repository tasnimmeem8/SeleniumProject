package date;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {

		// String month = "16 November,2022";
		// String day = "16";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//button[@type='button'])[16]").click();

		String text = driver.findElementByCssSelector("div[class*='date-picker-menu-pagination-container']").getText();
		System.out.println(text);
		/*
		 * while(true) { String text = driver.findElementByCssSelector(
		 * "div[class*='date-picker-menu-pagination-container']").getText();
		 * System.out.println(text); if(text.equals(month)) { break; }else {
		 * driver.findElementById("nextMonth-title").click(); } }
		 * 
		 * driver.
		 * findElementByClassName("uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary"
		 * ).click();
		 * 
		 */

	}

}

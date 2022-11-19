package date;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date2 {

	public static void main(String[] args) {

		String month = "November 2022";
	//	String day = "16";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.findElementById("cal0").click();
		while (true) {
			String text = driver.findElementByClassName("calendar__month").getText();
			System.out.println(text);

			if (text.equals(month)) {
				break;
			} else {
				driver.findElementByXPath("(//nav[@class='calendar__nav']/a)[2]").click();
			}
		}
		driver.findElementByXPath("//a[@id='closeCalendar']").click();

	}
}
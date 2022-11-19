package collections;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Set2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		String window1 = driver.getWindowHandle();
		System.out.println("1st Window = " + window1);
		driver.findElementByLinkText("Try it Yourself »").click();

		Set<String> allwindow = driver.getWindowHandles();
		for (String eachwindow : allwindow) {
			System.out.println(eachwindow);
		}

		driver.quit();

	}

}

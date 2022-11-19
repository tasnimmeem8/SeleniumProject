package collections;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Set3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		String initialwindow = driver.getWindowHandle();
		System.out.println("Initial window =" + initialwindow);
		driver.findElementByLinkText("Try it Yourself »").click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String eachwindow : allwindow) {
			System.out.println(eachwindow);
		}

		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();

		// Thread.sleep(3000);
		// driver.switchTo().window(initialwindow);
		Thread.sleep(3000);
		// driver.quit();

	}

}

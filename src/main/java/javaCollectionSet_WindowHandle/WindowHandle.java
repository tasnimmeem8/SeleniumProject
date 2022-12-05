package javaCollectionSet_WindowHandle;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		String firstWindow = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		System.out.println(firstWindow);
		System.out.println("");
		driver.findElementByLinkText("Try it Yourself »").click();
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(driver.getWindowHandles());
		
		for (String eachWindow:windows) {
			System.out.println(eachWindow);
		}
		

	}

}

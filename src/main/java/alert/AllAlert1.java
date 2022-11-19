package alert;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlert1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElementByCssSelector("button[onclick='jsPrompt()']").click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Hi My name is meem");
		Thread.sleep(3000);
		System.out.println("Prompt alert = " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Note on display= " + (driver.findElementByCssSelector("#result")).getText());

		driver.findElementByCssSelector("button[onclick*='jsAlert']").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Result =" + driver.findElementByCssSelector("#result").getText());

		driver.findElementByXPath("//button[contains(@onclick,'jsConfirm')]").click();
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("Result =" + driver.findElementByXPath("//p[@id='result']").getText());

		Thread.sleep(3000);
		driver.quit();

	}

}

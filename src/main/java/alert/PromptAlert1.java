package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert PromptAler1 = driver.switchTo().alert();
		PromptAler1.getText();
		System.out.println(PromptAler1.getText());
		PromptAler1.sendKeys("I am meem");
		Thread.sleep(5000);
		PromptAler1.accept();
		Thread.sleep(3000);
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		driver.close();

	}

}

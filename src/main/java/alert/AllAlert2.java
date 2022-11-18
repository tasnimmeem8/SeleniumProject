package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlert2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()= 'Click for JS Alert']").click();
		driver.switchTo().alert().accept();
		WebElement text = driver.findElementByXPath("//p[@id='result']");
		System.out.println(text.getText());
		driver.findElementByXPath("//button[text()= 'Click for JS Confirm']").click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebElement text1 = driver.findElementByXPath("//p[@id='result']");
		System.out.println(text1.getText());
		driver.findElementByXPath("//button[text()= 'Click for JS Prompt']").click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("MY Name is meem");
		alert.accept();
		WebElement text2 = driver.findElementByXPath("//p[@id='result']");
		System.out.println(text2.getText());
	}

}

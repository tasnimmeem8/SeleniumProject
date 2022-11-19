package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElementByLinkText("AGENT LOGIN").click();

		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		// driver.findElementByXPath("//button[text()='Try it']").click();

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		// click Create lead
		driver.findElementByLinkText("Create Lead").click();
		// Click Merge leads
		driver.findElementByLinkText("Merge Leads").click();
		// click merge
		driver.findElementByLinkText("Merge").click();

		String conformationAlert = driver.switchTo().alert().getText();
		System.out.println(conformationAlert);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		// String ConfirmationAlert = driver.switchTo().alert().getText();
		// System.out.println(ConfirmationAlert);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

		driver.close();
	}
}
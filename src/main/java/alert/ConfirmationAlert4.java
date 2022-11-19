package alert;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		Thread.sleep(3000);
		// Alert alrt = driver.switchTo().alert();
		// alrt.getText();
		// System.out.println(alrt.getText());
		// alrt.accept();
		System.out.println("Conformation Alert =" + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
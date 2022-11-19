package testCases_LeafTap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) throws InterruptedException {

		// public void tagName() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();

		// Using WebDriver interface and create object of ChromeDriver class
		WebDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		// driver.get("http://www.indeed.com");

		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();

		// click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Find how many a tag/link in this page?
		// List<WebElement> linkList = driver.findElements(By.tagName("a"));
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

		// List elements = driver.findElements(By.tagName("div"));
		// int total = elements.size();
		// int total = elements.size();
		// List elements = driver.findElements(By.tagName("input"));
		// int total = elements.size();

		// System.out.println(total);
		// System.out.println("Total webelements starting with TagName 'div' :" +
		// total);
		// System.out.println("Total Tagname 'Div' :" + total);
		// System.out.println("Total Tagname 'input' :" + total);
		Thread.sleep(2000);
		driver.close();

	}
}
package learnSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_alert {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//simple alert
		System.out.println("simple-");
		driver.findElementByXPath("//button[@onclick='jsAlert()']").click();
		Alert alrt = driver.switchTo().alert();
		System.out.println("Alert message - "+alrt.getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		alrt.accept();
		String text = driver.findElementById("result").getText();
		System.out.println(text);
		System.out.println("");
		
		//confirmation alert
		System.out.println("comfirmation-");
		driver.findElementByXPath("//button[@onclick='jsConfirm()']").click();
		Alert alrt1 = driver.switchTo().alert();
		System.out.println("Alert message - "+alrt1.getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		alrt1.accept();
	    String text1 = driver.findElementById("result").getText();
	    System.out.println(text1);
	    System.out.println("");
		
		//prompt alert
	    System.out.println("prompt-");
	    
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='jsPrompt()']")));
	    
	    driver.findElementByXPath("//button[@onclick='jsPrompt()']").click();
	    Alert alrt2 = driver.switchTo().alert();
	    System.out.println("Alert message - "+alrt2.getText());
	    alrt2.sendKeys("Hi my name is meem");
	    alrt2.accept();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    String text2 = driver.findElementById("result").getText();
	    System.out.println(text2);
	    
	    driver.close();
		
		

	}

}	



		

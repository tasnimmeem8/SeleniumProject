package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//Create object of ChromeDriver Class
				ChromeDriver driver = new ChromeDriver();
				//Load URL
				driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
				//Maximize window
				driver.manage().window().maximize();
				//Implicitly wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				//Click Submit 
				driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();


				//switch control to Alert from HTML page and get the Alert text
				String simpleAlert = driver.switchTo().alert().getText();
				System.out.println(simpleAlert);

				//String simpleAlert	= driver.switchTo().alert().getText();
				//System.out.println(simpleAlert);

				Thread.sleep(3000);
				//Click on ok button
				driver.switchTo().alert().accept();
				//Close the browser
				driver.close();

	}

}

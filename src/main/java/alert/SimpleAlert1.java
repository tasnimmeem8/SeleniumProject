package alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert1 {

	public static void main(String[] args) throws InterruptedException {

    
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver ();
	
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.findElementById("searchBtn").click();
		
		//String simple = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		
		
		
		//String Simple = driver.switchTo().alert().getText();

		//driver.switchTo().alert().accept();
		
		//driver.close();
			

	}

}

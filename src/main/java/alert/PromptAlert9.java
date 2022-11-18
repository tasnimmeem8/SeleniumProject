package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElementByXPath("//*[@id=\"content\"]/div/ul/li[3]/button").click();
        Alert Prompt = driver.switchTo().alert();
        Prompt.sendKeys("I am Meem");
        Prompt.accept();
        Thread.sleep(3000);
        WebElement rslt = driver.findElementById("result");
        rslt.getText();
        System.out.println(rslt.getText());
        
        
       driver.quit();
		
		
		
		
		
		
		
		
	}

}

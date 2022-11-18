package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert2 {

	public static void main(String[] args) throws InterruptedException {



	System.setProperty("webdriver.chrome.driver","C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElementById("//button[text()='Click for JS Prompt']").click();
	Alert prompt = driver.switchTo().alert();
	prompt.getText();
	System.out.println(prompt.getText());
	prompt.sendKeys("Life is short live it up");
    prompt.accept();
	Thread.sleep(9000);
	String text = driver.findElementById("result").getText();
	System.out.println(text);
	driver.close();
	

	
	}

}

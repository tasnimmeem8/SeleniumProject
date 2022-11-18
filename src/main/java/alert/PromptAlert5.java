package alert;

import org.openqa.selenium.Alert;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.findElementByXPath("//*[@id=\"content\"]/div/ul/li[3]/button").click();
	    Alert Prompt = driver.switchTo().alert();
	    Prompt.getText();
	    System.out.println(Prompt.getText());
	    Prompt.sendKeys("I am sweet");
	    Prompt.accept();
	    String text = driver.findElementById("result").getText();
	    System.out.println(text);
	    Thread.sleep(3000);
	    driver.close();

	
	
	
	
	
	
	
	
	}

}

package alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert4 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElementByXPath("//*[@id=\"content\"]/div/ul/li[3]/button").click();
		Alert PromptAlert = driver.switchTo().alert();
        PromptAlert.getText();
        System.out.println(PromptAlert.getText());
        PromptAlert.sendKeys("I am happy");
        PromptAlert.accept();
        String text = driver.findElementById("result").getText();
        System.out.println(text);
        driver.close();
	}

}

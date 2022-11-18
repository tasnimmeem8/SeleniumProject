package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChild {

	public static void main(String[] args) {
		
		
		//Parent basic xpath/child tagname
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/");
		
		//PerentChild with collection
		driver.findElementByXPath("((//li[@class='menu-item'])/a)[1]").click();
        driver.findElementByXPath("((//li[@class='menu-item'])/a)[3]").click();
        driver.findElementByXPath("((//li[@class='menu-item'])/a)[4]").click();
        driver.findElementByXPath("((//li[@class='menu-item'])/a)[5]").click();
        
        driver.quit();
        
	
	
	}

}

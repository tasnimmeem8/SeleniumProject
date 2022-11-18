package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChild1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver ();
        
        driver.navigate().to("https://www.mbusa.com/");
        driver.findElementByXPath("(//nav[@class='global-header__menu-l1 global-header__menu-l1--closed']/div/ul/li/button)[1]").click();
		
		
		
		
		
		
		
		
	}

}

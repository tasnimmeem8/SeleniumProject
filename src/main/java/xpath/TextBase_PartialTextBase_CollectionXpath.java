package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextBase_PartialTextBase_CollectionXpath {

	public static void main(String[] args) {
		
		
		//tagname[text()='text']  
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://tepeople.com");
		
		//Partial Text Base Xpath
		//tagname[contains(text(),'text')]
        driver.findElementByXPath("//a[contains(text(),'Services')]").click();
        
        //Text Base Xpath
        //tagname[text()='text']  
        driver.findElementByXPath("//a[text()='Company']").click();
        
        //Collection Xpath
        //(any Xpath)[index]
        driver.findElementByXPath("(//a[contains(text(),'Training')])[1]").click();
        
        
        driver.quit();
	}

}

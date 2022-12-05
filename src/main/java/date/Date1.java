package date;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date1 {

	public static void main(String[] args) {
		
		String month= "Sun, Dec 11";
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		driver.findElementByCssSelector("#d1-btn").click();
		
		while(true) {
			String text = driver.findElementByXPath("(//span[@class='uitk-date-picker-selection-date'])[1]").getText();
			System.out.println(text);
			
			if (text.equals(month)) {
				break;
			}else {
				driver.findElementByClassName("//button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-layout-flex-item uitk-button-paging'][2]").click();
			}
		}
	
		
		

	}

}

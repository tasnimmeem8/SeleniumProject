package frame_iframe;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe {

	public static void main(String[] args) {
	
		//to search iframe/frame ,check inspect list of (view frame source and frame reload)
		//Write frame / iframe in find (ctrl+f)
		//Have to enter and exit from frame
		//Enter 3 ways 
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		//if iframe has any id or name we can use its value directly 
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//a[@id='navbtn_menu']").click();
		driver.findElementByXPath("//a[@id='w3loginbtn']");
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
		
	}

}

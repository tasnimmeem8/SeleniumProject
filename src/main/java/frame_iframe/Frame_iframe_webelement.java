package frame_iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_webelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Selectable']").click();
		WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frm);

		driver.findElementByXPath("(//ol[@id='selectable']/li)[1]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[2]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[3]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[4]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[5]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[6]").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("//a[text()='Demos']").click();
		driver.close();

	}

}

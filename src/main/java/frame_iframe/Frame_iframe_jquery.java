package frame_iframe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_jquery {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/");
		//driver.findElementByXPath("//a[text()='Selectable']").click();
		try {
		driver.findElementByXPath("//a[text()='Selectabl']").click();
		}catch(Exception e){System.err.println("Selectable button not working");
		throw new RuntimeException();
		}
		
		finally {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("./snap/img17.png");
			FileUtils.copyFile(src, dst);
		}
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		
		driver.findElementByXPath("(//ol[@id='selectable']/li)[1]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[2]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[3]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[4]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[5]").click();
		driver.findElementByXPath("(//ol[@id='selectable']/li)[6]").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("//a[text()='Demos']").click();
		driver.quit();
	}

}

package xpath;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		System.out.println("Page title = "+ driver.getTitle());
		System.out.println("Total length = "+ driver.getTitle().length());
		System.out.println("Title contain Leaf = " + driver.getTitle().contains("Leaf"));
		System.out.println("Title in Upper case = " + driver.getTitle().toUpperCase());
		System.out.println("Title in lower case = " + driver.getTitle().toLowerCase());
		System.out.println("window handle = "+ driver.getWindowHandle());
		System.out.println("Page tag identity hash code = "+ System.identityHashCode(driver));
		
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[1]")).sendKeys("DemoSalesManager");
		Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).sendKeys("crmsfa").perform();
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//img[contains(@onmouseover,'crmHover.png')]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']/ul/li/a)[1]")).click();
		
		System.out.println("Page Title = "+ driver.getTitle());
	}

}

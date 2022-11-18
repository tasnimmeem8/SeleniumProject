package seleniumDemo;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHomeWork1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
		
		//Direct Locator		
		 driver.findElementById("username").sendKeys("DemoSalesManager"); //Id locator
		 driver.findElementByName("USERNAME").sendKeys("DemoSalesManager"); //Name locator
		 driver.findElementByClassName("inputLogin").sendKeys("DemoSalesManager"); // Class Name locator
	     driver.findElementByTagName("input").sendKeys("DemoSalesManager"); //Tag Name locator
				
		//Customize locator
		//Xpath
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager"); //Absolute
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("DemoSalesManager");//AttributeBase
		driver.findElementByXPath("//input[@type='text']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@size=50])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[contains(@class,'i')])[1]").sendKeys("DemoSalesManager");//Partial Attribute
		driver.findElementByXPath("(//input[contains(@type,'t')])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[contains(@id,'u')])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[contains(@name,'U')])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[contains(@size,'5')])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//p[@class='top']/input").sendKeys("DemoSalesManager");//parentToChild
		driver.findElementByXPath("(//input)[1]").sendKeys("DemoSalesManager");//Xpath using tagName 
		
		//CSS
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");//Id
		driver.findElementByCssSelector(".inputLogin").sendKeys("DemoSalesManager");//class
		driver.findElementByCssSelector("input[name='USERNAME']").sendKeys("DemoSalesManager");//Name
		driver.findElementByCssSelector("input[type='text']").sendKeys("DemoSalesManager");//type
		driver.findElementByCssSelector("input[size='50']").sendKeys("DemoSalesManager");//size
		
		driver.findElementByCssSelector("input[class^='i']").sendKeys("DemoSalesManager");//Starts with
		driver.findElementByCssSelector("input[type^='t']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[id^='u']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name^='U']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size^='5']").sendKeys("DemoSalesManager");
		
		driver.findElementByCssSelector("input[class$='n']").sendKeys("DemoSalesManager");//ends with
		driver.findElementByCssSelector("input[type$='t']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[id$='e']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name$='E']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size$='0']").sendKeys("DemoSalesManager");
		
		driver.findElementByCssSelector("input[class*='L']").sendKeys("DemoSalesManager");//contains
		driver.findElementByCssSelector("input[type*='x']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[id*='e']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name*='E']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size*='0']").sendKeys("DemoSalesManager");
		
		driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");//Parent to child
		driver.findElementByCssSelector("label[for='username']+input").sendKeys("DemoSalesManager");//sibling to sibling
		
		
		
		
		
		
		
		
		
	}

}

package assertion;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_true1 {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
		//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
		
		driver.findElementByXPath("//div[@class='remember-info']/input").click();
		boolean ckecked = driver.findElementByXPath("//div[@class='remember-info']/input ").isSelected();
		System.out.println(ckecked);

		//Assertion
		Assert.assertTrue(ckecked, "CheckBox is selected");

		//Validation
		if(ckecked==true) {
			System.out.println("The checkbox is Selected");
		}else {
			System.out.println("The checkbox is not Selected");
		}

		//driver.quit();
	


	}

}

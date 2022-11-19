package testCases_LeafTapCD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_CrmDvr_TestLeaf;

public class CreateContact extends ProjectSpecificWrapper_CrmDvr_TestLeaf {

	@Test
	public void createContact() {
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementByName("firstName").sendKeys("Hema");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Mali");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Mrs.");

		WebElement cur = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dd = new Select(cur);
		dd.selectByVisibleText("AOK - Angolan Kwanza");
	}
}

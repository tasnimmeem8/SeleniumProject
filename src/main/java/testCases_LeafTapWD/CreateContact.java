package testCases_LeafTapWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr_TestLeaf;

public class CreateContact extends ProjectSpecificWrapper_WbDvr_TestLeaf{
	
	@Test
	public void creatContact() {
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.name("firstName")).sendKeys("Hema");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Mali");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("Mrs.");
		
		WebElement cur = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select dd = new Select (cur);
		dd.selectByVisibleText("AOK - Angolan Kwanza");
	}

}

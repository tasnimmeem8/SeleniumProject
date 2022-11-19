package testCases_LeafTapWD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr_TestLeaf;

public class CreateAccount extends ProjectSpecificWrapper_WbDvr_TestLeaf {

	@Test
	public void createAccount() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Checking Account");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Checking");
		driver.findElement(By.id("annualRevenue")).sendKeys("32000");

		WebElement cur2 = driver.findElement(By.id("currencyUomId"));
		Select dd6 = new Select(cur2);
		dd6.selectByVisibleText("USD - United States Dollar");

		WebElement ind2 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dd7 = new Select(ind2);
		dd7.selectByVisibleText("Computer Software");

		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select dd8 = new Select(own);
		dd8.selectByVisibleText("S-Corporation");

	}

}

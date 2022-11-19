package testCases_LeafTapWD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_WbDvr_TestLeaf;

public class CreateOpportunity extends ProjectSpecificWrapper_WbDvr_TestLeaf {

	@Test
	public void createOpportunity() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Create Opportunity")).click();
		driver.findElement(By.id("createOpportunityForm_opportunityName")).sendKeys("ABC");
		WebElement opp = driver.findElement(By.id("createOpportunityForm_opportunityStageId"));
		Select dd = new Select(opp);
		dd.selectByVisibleText("Closed");

	}

}

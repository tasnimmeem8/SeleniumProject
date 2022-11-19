package testCases_LeafTapEdge;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.ProjecSpecificWrapper_Edge_TestLeaf;

public class CreateLead extends ProjecSpecificWrapper_Edge_TestLeaf {

	@Test
	public void createLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("ABC");

	}
}

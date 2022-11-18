package testCases_LeafTapFireFox;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper_fireFox_TestLeaf;

public class CreateLead extends ProjectSpecificWrapper_fireFox_TestLeaf{
	
	@Test
	public void createLead() {
		driver.findElement(By.xpath("(//ul[@class='shortcuts']/li/a)[1]")).click();
		
	}

	
}

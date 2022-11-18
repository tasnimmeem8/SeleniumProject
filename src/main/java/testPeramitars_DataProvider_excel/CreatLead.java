package testPeramitars_DataProvider_excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;
public class CreatLead extends ProjectSpecificWrapper {
	
	
	@Test (dataProvider="getData")
	public void creatLead(String cName,String fName,String lName) throws IOException {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\tasni\\eclipse-workspace1\\SeleniumProject\\snap\\img6.png");
		FileUtils.copyFile(src, dst);
	
	}

}

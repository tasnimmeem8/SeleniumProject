package learnTestNGParameters_excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class CreatLead extends ProjectSpecificWrapper {

	@Test(dataProvider = "getdata")
	public void creatLead(String comName, String FName, String LName) throws IOException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comName);
		driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys(FName);
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys(LName);
		driver.getTitle();

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/img18.png");
		FileUtils.copyFile(src, dst);

	}

}

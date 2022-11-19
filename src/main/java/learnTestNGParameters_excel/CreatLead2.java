package learnTestNGParameters_excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatLead2 extends ProjectSpecificWrapper3 {

	@Test(dataProvider = "getdata3")
	public void creatLead(String cName, String fName, String lName) throws IOException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		WebElement src1 = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src1);
		dd.selectByVisibleText("Direct Mail");

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/img11.png");
		FileUtils.copyFile(src, dst);
	}

}

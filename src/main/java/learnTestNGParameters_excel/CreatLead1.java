package learnTestNGParameters_excel;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreatLead1 extends ProjectSpecificWrapper1 {

	@Test(dataProvider = "getdata1")
	public void CreatLead(String comName, String FName, String LName) throws IOException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comName);
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);

		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Direct Mail");

		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/img15.png");
		FileUtils.copyDirectory(src1, dst);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("createLeadForm_dataSourceId")));

	}

}

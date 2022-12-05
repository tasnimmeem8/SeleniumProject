package learnTestNGParameters_excel_4;

import org.testng.annotations.Test;

public class TestCase extends ProjectSpecificWrapper {
	
	
	
	@Test (dataProvider="getData")
	public void CreatLead(String cname, String fname, String lname) {
		

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys(fname);
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys(lname);
		driver.getTitle();
	}

}

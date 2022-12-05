package learnTestNGParameters_excel_1;

import org.testng.annotations.Test;



public class TestCase extends ProjectSpesificWrapper{
	
	@Test (dataProvider ="getData")
		public void creatLead(String comName, String FName, String LName) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comName);
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
	
	

		
	}

}

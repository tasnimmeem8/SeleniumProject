package learn_Selenium_Interface;

import org.testng.annotations.Test;

public class CreatLead extends GenericWrapper {
	
	@Test 
	public void creatLead(){
		
		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterByXpath("//input[@id='password']","crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", "ABC");
		enterById("createLeadForm_firstName", "Hema");
		enterById("createLeadForm_lastName", "Mali");
		
	
	}

}

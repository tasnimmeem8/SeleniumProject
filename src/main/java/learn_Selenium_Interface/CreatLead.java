package learn_Selenium_Interface;

import org.testng.annotations.Test;

public class CreatLead extends GenericWrapper {


	@Test(dataProvider="getData")
	public void creatLead(String cname, String fname, String lname) throws InterruptedException {

		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoCSR");
		enterByXpath("//input[@id='password']", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", cname);
		enterById("createLeadForm_firstName", fname);
		enterById("createLeadForm_lastName", lname);

	}
	

}

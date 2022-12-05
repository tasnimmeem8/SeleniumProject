package learn_Selenium_Interface2;

import org.testng.annotations.Test;

public class CreatLead extends GenericWrapper {

	@Test
	public void creatLead() {
		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClass("decorativeSubmit");
		clickByLinkText("CRM/SFA");

	}

}

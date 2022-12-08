package learn_Selenium_Interface3;

import org.testng.annotations.Test;

public class CreatLead extends GenericWrapper{
	
	@Test
	public void creatLead() {
		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		
		
	}

	
}

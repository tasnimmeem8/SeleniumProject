package learn_Selenium_Interface2;

public interface WrapperMethods {
	
	public void login(String url);
	
	public void enterById(String locator, String data);
	public void enterByXpath(String locator, String data);
	
	public void clickByClass(String locator);
	public void clickByXpath(String locator);
	public void clickByLinkText(String locator);
	
	public void chooseVisibleTextById(String locator, String data);
	

}

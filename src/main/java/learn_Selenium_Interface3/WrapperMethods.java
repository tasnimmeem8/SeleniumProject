package learn_Selenium_Interface3;

public interface WrapperMethods {
	

	public void login(String url);
	public void enterById (String locator, String data);
	public void enterByXpath (String locator, String data);
	public void enterByClass(String locator, String data);
	public void clickById (String locator);
	public void clickByXpath (String locator);
	public void clickByClassName (String locator);
	public void clickByLinkText (String locator);
	public void ChooseVisibleTextById (String locator , String text);

}

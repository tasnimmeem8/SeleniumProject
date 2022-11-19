package learn_Selenium_Interface1;

public interface WrapperMethods {

	public void login(String url);

	public void enterById(String locatorValue, String data);

	public void enterByName(String locatorValue, String data);

	public void enterByXpath(String locatorValue, String data);

	public void enterByCSS(String locatorValue, String data);

	public void clickById(String locatorValue);

	public void clickByXpath(String locatorValue);

	public void clickByCSS(String locatorValue);

	public void clickByLinkText(String locatorValue);

	public void clickByClass(String locatorValue);

	public void chooseVisibleTextById(String locatorValue, String data);

}

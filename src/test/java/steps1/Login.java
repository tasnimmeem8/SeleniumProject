package steps1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	ChromeDriver driver;

	@Given("Launch chrome browser and load URL")
	public void launch_chrome_browser_and_load_URL() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    Thread.sleep(2000);
	}

	@Given("enter username as (.*)")
	public void enter_username_as_DemoSalesManager(String uname) {
	    driver.findElementById("username").sendKeys(uname);
	}

	@Given("enter password as (.*)")
	public void enter_password_as_crmsfa(String pword) {
	    driver.findElementById("password").sendKeys(pword);
	}

	@When("Click the login button")
	public void click_the_login_button() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated Homepage")
	public void its_navigated_Homepage() {
	    System.out.println(driver.getTitle());
	}

	@Then("Click the logout button")
	public void click_the_logout_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	}

	@When("Click CRM\\/SFA link")
	public void click_CRM_SFA_link() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("Creat Account link button")
	public void creat_Account_link_button() {
	    driver.findElementByLinkText("Create Account").click();
	}

	@When("Enter Account name as ABC.inc")
	public void enter_Account_name_as_ABC_inc() {
	    driver.findElementByXPath("//input[@id='accountName']").sendKeys("ABC");
	}

	@When("Enter Annual Revenue as ${int}")
	public void enter_Annual_Revenue_as_$(Integer int1) {
	    driver.findElementById("annualRevenue").sendKeys("2000");
	}
	@When("Click Creat Lead link button")
	public void click_Creat_Lead_link_button() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter company name as (.*)")
	public void enter_company_name_as_ABC(String cname) {
	    driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@When("Enter first name as (.*)")
	public void enter_first_name_as_Hema(String fname) {
	    driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@When("Enter last name as (.*)")
	public void enter_last_name_as_Ma(String lname) {
	    driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("Choose Direct Mail from source")
	public void choose_Direct_Mail_from_source() {
	    WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select (src);
	    dd.selectByVisibleText("Direct Mail");
	}

}

package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	ChromeDriver driver;
	@Given("Launch chrome browser and load")
	public void launch_chrome_browser_and_load() throws InterruptedException {
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
	    driver.close();
	}

	@Given("enter username as DemoCSR")
	public void enter_username_as_DemoCSR() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Launch Chrome browser and load")
	public void launch_Chrome_browser_and_load() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("enter username as DemosSalesManager")
	public void enter_username_as_DemosSalesManager() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("enter password as CRM")
	public void enter_password_as_CRM() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Then nevigated to same page")
	public void then_nevigated_to_same_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Error message will shown")
	public void error_message_will_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Check the error messag")
	public void check_the_error_messag() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}

package stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import resources.base;

public class stepDefinition extends base {
	
	LandingPage l;
	RegisterPage r;
	

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver(); // Line when you are inheriting a class and accessing to one method on it

	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);

	}

	@Given("^Click on Login link in home page to land on Secure Sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_Sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		if (l.getPopUpSize() > 0) {
			l.getPopUp().click();
		}
		l.getLogin();

	}


	@When("^User enters (.+) and (.+) and logs in$") // Step with parametrization
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_not_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// System.out.println("User not successfully logged in");
		// portalHomePage p=new portalHomePage(driver);
		// Assert.assertTrue(p.getSearchBox().isDisplayed());

	}

	//@And("^Close browsers$")
    @And("^Close browsers in Login TC1$")
    public void close_browsers_in_login_tc1() throws Throwable {
		driver.quit();
	}
	
    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
		driver = initializeDriver();
	}

	@And("^Navigate to \"([^\"]*)\" URL$")
	public void navigate_to_URL(String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg2);

	}
	
	@And("^Click on Register button in home page to land on Register page$")
	public void click_on_register_button_in_home_page_to_land_on_register_page() throws Throwable {
		l = new LandingPage(driver);
		l.getRegister().click();
	}

    @When("^User completes (.+), (.+), (.+), (.+) and check terms$")
    public void user_completes_and_check_terms(String fullname, String email, String password, String confpass) throws Throwable {
		r = new RegisterPage(driver);
		r.getFullName().sendKeys(fullname);
		r.getEmail().sendKeys(email);
		r.getPassword().sendKeys(password);
		r.getConfPass().sendKeys(confpass);
		r.getTerms().click();
	}

	@Then("^Verify that user is not successfully registered$")
	public void verify_that_user_is_not_successfully_registered() throws Throwable {
		System.out.println("User registered");
	}

	/*@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

	}*/

	
    @And("^Close browsers in Login TC2$")
    public void close_browsers_in_login_tc2() throws Throwable {
	 driver.quit(); }

	 

}

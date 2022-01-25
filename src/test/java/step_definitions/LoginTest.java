package step_definitions;

import org.testng.Assert;

import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginSuccessPage;

public class LoginTest extends MainClass{
	HomePage hp = new HomePage();
	LoginSuccessPage lsp = new LoginSuccessPage();
	
	@Given("user loads application")
	public void user_loads_application() {
		Assert.assertEquals(hp.captureHomePageTitle(), prop.getProperty("expectedHomePageTitle"));
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		hp.enterUserName("test12");
	}

	@And("user enters valid password")
	public void user_enters_valid_password() {
		hp.enterPassword("123");
	}

	@And("user click submit button")
	public void user_click_submit_button() {
		hp.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	   Assert.assertEquals(lsp.captureLoginSuccessPageUrl(), prop.getProperty("loginSuccessPageUrl"));
	}

	@And("user should see login success message")
	public void user_should_see_login_success_message() {
	    Assert.assertEquals(lsp.captureLoginSuccessMsg(), prop.getProperty("loginSuccessMsg"));
	}

	@And("user hits Enter key")
	public void user_hits_enter_key() {
	    hp.hittingEnterKey();
	}
	
	@When ("user enters invalid username")
	public void user_enters_invalid_username() {
		hp.enterUserName("tommy123");
	}
	
	@And ("user enters invalid password")
	public void user_enters_invalid_password() {
		hp.enterPassword("12345");
	}
	
	@Then ("user should not be able to login")
	public void user_should_not_be_able_to_login() {
		 Assert.assertEquals(hp.captureHomePageUrl(), prop.getProperty("homePageUrl"));
	}	 
	
	@And ("user should see login error message")
	public void user_should_see_login_error_message() {
		Assert.assertTrue(hp.validatePresenceOfLoginErrorMsg());
	}

	@When("user enters blank username") 
    public void user_enters_blank_username() {
		hp.enterUserName("");
    }
	
	@And("user enters blank password")
	public void user_enters_blank_password() {
		hp.enterPassword("");
	}

}

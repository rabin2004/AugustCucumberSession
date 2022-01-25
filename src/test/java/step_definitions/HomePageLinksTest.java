package step_definitions;

import org.testng.Assert;
import base.MainClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class HomePageLinksTest extends MainClass{
	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
		
	@When ("user click Register link from homepage")
	public void user_click_Register_link_from_homepage() {
		hp.clickSubmitBtn();
	}
	
	@Then ("user should land in register page")
	public void user_should_land_in_register_page() {
		Assert.assertEquals(rp.captureRegisterPageTitle(), prop.getProperty("expectedRegisterPageTitle"));
	}

}

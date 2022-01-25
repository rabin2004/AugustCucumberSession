package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class RegisterPage extends MainClass{
	@FindBy(name="email")
	WebElement usernameTxtField;
	@FindBy(name="password")
	WebElement passwordTxtField;
	@FindBy(name="confirmPassword")
	WebElement confirmPasswordTxtField;
	@FindBy(name="submit")
	WebElement submitBtn;
	@FindBy(xpath="//input[@name='confirmPassword']/following-sibling::span")
	WebElement registrationErrorMsg;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void submitRegistrationForm(String username, String password, String confirmPassword) {
		usernameTxtField.sendKeys(username);
		passwordTxtField.sendKeys(password);
		confirmPasswordTxtField.sendKeys(confirmPassword);
		submitBtn.click();
	}
	
	public String captureRegisterPageTitle() {
		return driver.getTitle();
	}
	
	public String captureRegisterPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String captureRegistrationErrorMsg() {
		return registrationErrorMsg.getText().trim();
	}

}

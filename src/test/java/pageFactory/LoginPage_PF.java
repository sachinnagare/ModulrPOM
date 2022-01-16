/**
 * Design Pattern used - Page Object Model (POM) by using Page Factory. 
 * The LoginPage_PF.Java file find the all the Locators available on the page. All required methods are written here.
 *
 * @author  Sachin Nagare
 * @version 1.0
 * @since   2020-01-16
 */

package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy (id="username-inp")
	WebElement txt_username;

	@FindBy (id="password-inp")
	WebElement txt_password;

	@FindBy(id="signInSubmitButton")
	WebElement btn_signIn;

	@FindBy(id="forgotPasswordHref")
	WebElement lnk_forgotPassword;
	
	@FindBy(id="usernameInput")
	WebElement txt_ForgotPasswordUserName;
	
	@FindBy(id="signInSubmitButton")
	WebElement btn_requestReset;
	
	@FindBy(id="emailSentHeading")
	WebElement hd_emailSentHeading;
	
	WebDriver driver;
	public  LoginPage_PF(WebDriver driver) {
		PageFactory.initElements(driver, LoginPage_PF.class);
	}
	

	public void enterUserName(String username) {

		txt_username.sendKeys(username);

	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		btn_signIn.click();
	}

	public void clickOnForgotPasswordLink()
	{
		lnk_forgotPassword.click();
	}
	
	public void enterUsernameToResetPassword(String username) {
		txt_ForgotPasswordUserName.sendKeys(username);
	}
	
	public void clickOnRequestResetButton() {
		btn_requestReset.click();	
	}

	public boolean validateResetEmailPopup(boolean popup)
	{
		 boolean popup1=  hd_emailSentHeading.isDisplayed();
		return popup1;
	}


}

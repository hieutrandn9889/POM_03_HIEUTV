package pages;

import org.openqa.selenium.WebDriver;

import BankGuru99.LoginPageUI;
import commons.AbstractPage;

public class GR_LoginPage extends AbstractPage {
	WebDriver driver;

	public GR_LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void typetoUsername(String userName) {
		sendKeysToElement(driver ,LoginPageUI.USERNAME_TEXTBOX, userName);
	}
	public void typetoPassword(String password) {
		sendKeysToElement(driver ,LoginPageUI.PASSWORD_TEXTBOX, password);
	}
	public GR_HomePage clickToSubmitButton(){
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return GR_PageFactory.getHomePage(driver);
	}
}

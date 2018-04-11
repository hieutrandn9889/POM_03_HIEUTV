package pages;

import org.openqa.selenium.WebDriver;

public class GR_PageFactory {

	public static GR_LoginPage getLoginPage(WebDriver driver) {
		return new GR_LoginPage(driver);
	}

	public static GR_HomePage getHomePage(WebDriver driver) {
		return new GR_HomePage(driver);
	}

	public static GR_NewCustomerPage getNewCustomerPage(WebDriver driver) {
		return new GR_NewCustomerPage(driver);
	}
	public static GR_NewAccountPage getNewAccountPage(WebDriver driver) {
		return new GR_NewAccountPage(driver);
	}

	public static GR_EditCustomerPage getEditCustomerPage(WebDriver driver) {
		return new GR_EditCustomerPage(driver);
	}

	public static GR_DeleteCustomerPage getDeleteCustomerPage(WebDriver driver) {
		return new GR_DeleteCustomerPage(driver);
	}
}

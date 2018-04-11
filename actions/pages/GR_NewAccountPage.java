package pages;

import org.openqa.selenium.WebDriver;

import BankGuru99.NewAccountPageUI;
import BankGuru99.NewCustomerPageUI;
import commons.AbstractPage;

public class GR_NewAccountPage extends AbstractPage {

	WebDriver driver;

	public GR_NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCustomerID() {
		return getTextElement(driver, NewCustomerPageUI.CUSTOMER_ID);
	}
	
	public void selectToSubmitAccountType() {
		selectToElement(driver, NewAccountPageUI.ACCOUNT_TYPE, "Current");
		
	}
	public void clickToSubmit() {
		clickToElement(driver, NewAccountPageUI.ACCOUNT_TYPE);
	}

}
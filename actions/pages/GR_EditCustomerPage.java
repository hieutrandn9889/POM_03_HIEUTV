package pages;

import org.openqa.selenium.WebDriver;

import BankGuru99.EditCustomerPageUI;
import BankGuru99.NewCustomerPageUI;
import commons.AbstractPage;

public class GR_EditCustomerPage extends AbstractPage {
	WebDriver driver;
	public GR_EditCustomerPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickToTextBox() {
		clickToElement(driver, EditCustomerPageUI.ACCOUNT_NO);
	}
	
	public void clickToSubmitButton() {
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON_EDIT);
	}
	
	public void clickToSubmitButtonEdited() {
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON_EDITED);
	}
	
	public void typetoTabButton() {
		sendKeysToTabButton(driver, EditCustomerPageUI.ACCOUNT_NO);
	}
	
	public void typetoTabButtonAddress() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.ADDRESS);
	}
	
	public void typetoTabButtonCity() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.CITY);
	}
	public void typetoTabButtonState() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.STATE);
	}
	public void typetoTabButtonPin() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.PIN);
	}
	
	public void typetoTabButtonMobile() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.MOBILE_NUMBER);
	}
	
	public void typetoTabButtonEmail() {
		sendKeysToClearAndTabButton(driver, EditCustomerPageUI.EMAIL);
	}
	
	public void typetoNumberCity(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.CITY, value);
	}
	
	public void typetoNumberState(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.STATE, value);
	}
	
	public void typetoNumberPin(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.PIN, value);
	}
	
	public void typetoSpecialCity(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.CITY, value);
	}
	
	public void typetoSpecialState(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.STATE, value);
	}
	
	public void typetoSpecialPin(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.PIN, value);
	}
	
	public void typetoSpecialEmail(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.EMAIL, value);
	}
	
	public void checkEqualVerify(String value) {
		isControlDisplayed(driver, EditCustomerPageUI.DYNAMIC_CUSTOMER_ID, value);
	}
	
	public void checkEqualVerifyAddress(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_ADDRESS_TEXT, value);
	}
	
	public void checkEqualVerifyCity(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_CITY_TEXT, value);
	}
	
	public void checkEqualVerifyState(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_STATE_TEXT, value);
	}
	
	public void checkEqualVerifyPin(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_PIN_TEXT, value);
	}
	
	public void checkEqualVerifyMobile(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_TELEPHONE_TEXT, value);
	}
	
	public void checkEqualVerifyEmail(String value) {
		checkEqualString(driver, EditCustomerPageUI.XPATH_EMAIL_TEXT, value);
	}
	public void typetoCustomerID(String value) {
		sendKeysToElement(driver ,EditCustomerPageUI.ACCOUNT_NO, value);
	}
	
	public void typetoCustomerName() {
		sendKeysToElementJavascriptTabButton(driver ,EditCustomerPageUI.CUSTOMER_NAME);
	}
	
	public void typetoNumericName(String value) {
		sendKeysToElementJavascriptNumber(driver ,EditCustomerPageUI.CUSTOMER_NAME, value);
	}
	
	public void typetoSpecialName(String value) {
		sendKeysToElementJavascriptSpecial(driver ,EditCustomerPageUI.CUSTOMER_NAME, value);
	}
	
	
	// edit
	public void typeToEditElementAddress(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.ADDRESS, value);
	}
	
	public void typeToEditElementCity(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.CITY, value);
	}
	public void typeToEditElementState(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.STATE, value);
	}
	public void typeToEditElementPin(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.PIN, value);
	}
	
	public void typeToEditElementMobile(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.MOBILE_NUMBER, value);
	}
	
	public void typeToEditElementEmail(String value) {
		sendKeysToElement(driver, EditCustomerPageUI.EMAIL, value);
	}
	public void checkEqualVerifyEditSuccess(String value) {
		checkEqualString(driver, EditCustomerPageUI.CUSTOMER_EDIT_SUCCESSFUL, value);
	}
}

package pages;

import org.openqa.selenium.WebDriver;

import BankGuru99.EditCustomerPageUI;
import BankGuru99.NewCustomerPageUI;
import commons.AbstractPage;

public class GR_NewCustomerPage extends AbstractPage {

	WebDriver driver;

	public GR_NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToTextBox() {
		clickToElement(driver, NewCustomerPageUI.CUSTOMER_NAME);
	}
	public void clickToRadio() {
		clickToCheckBoxOrRadioButton(driver, NewCustomerPageUI.GENDER);
	}
	
	public void clickToAddress() {
		clickToElement(driver, NewCustomerPageUI.ADDRESS);
	}
	public void clickToCity() {
		clickToElement(driver, NewCustomerPageUI.CITY);
	}
	
	public void clickToState() {
		clickToElement(driver, NewCustomerPageUI.STATE);
	}
	
	public void clickToPin() {
		clickToElement(driver, NewCustomerPageUI.PIN);
	}
	
	public void clickToTelephone() {
		clickToElement(driver, NewCustomerPageUI.MOBILE_NUMBER);
	}
	
	public void clickToEmail() {
		clickToElement(driver, NewCustomerPageUI.EMAIL);
	}
	public void clickToSubmit() {
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON_NEW);
	}
	
	public void typetoTabButton() {
		sendKeysToTabButton(driver, NewCustomerPageUI.CUSTOMER_NAME);
	}
	
	public void typetoTabButtonAdress() {
		sendKeysToTabButton(driver, NewCustomerPageUI.ADDRESS);
	}
	public void typetoTabButtonCity() {
		sendKeysToTabButton(driver, NewCustomerPageUI.CITY);
	}
	
	public void typetoTabButtonState() {
		sendKeysToTabButton(driver, NewCustomerPageUI.STATE);
	}
	
	public void typetoTabButtonPin() {
		sendKeysToTabButton(driver, NewCustomerPageUI.PIN);
	}
	
	public void typetoTabButtonTelephone() {
		sendKeysToTabButton(driver, NewCustomerPageUI.MOBILE_NUMBER);
	}
	
	public void typetoTabButtonEmail() {
		sendKeysToTabButton(driver, NewCustomerPageUI.EMAIL);
	}
	
	public void checkEqualVerify(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_CUSTOMER_NAME_TEXT, value);
	}
	
	public void checkEqualVerifyAddress(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_ADDRESS_TEXT, value);
	}
	
	public void checkEqualVerifyCity(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_CITY_TEXT, value);
	}
	public void checkEqualVerifyState(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_STATE_TEXT, value);
	}
	public void checkEqualVerifyPin(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_PIN_TEXT, value);
	}
	
	public void checkEqualVerifyTelephone(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_TELEPHONE_TEXT, value);
	}
	
	public void checkEqualVerifyEmail(String value) {
		checkEqualString(driver, NewCustomerPageUI.XPATH_EMAIL_TEXT, value);
	}
	
	public void checkEqualVerifyCutomerRegisterSuccess(String value) {
		checkEqualString(driver, NewCustomerPageUI.CUSTOMER_REGISTER_SUCCESSFUL, value);
	}
	public void typetoCustomerName(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.CUSTOMER_NAME, value);
	}
	
	public void typetoBirthDay(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.DATE_OF_BIRTH, value);
	}
	
	public void typetoAddress(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.ADDRESS, value);
	}
	public void typetoCity(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.CITY, value);
	}
	public void typetoState(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.STATE, value);
	}
	public void typetoPin(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.PIN, value);
	}
	public void typetoTelephone(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.MOBILE_NUMBER, value);
	}
	public void typetoEmail(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.EMAIL, value);
	}
	public void typetoPassword(String value) {
		sendKeysToElement(driver ,NewCustomerPageUI.PASSWORD, value);
	}
	
	public String getCustomerID() {
		return getTextElement(driver, NewCustomerPageUI.CUSTOMER_ID);
	}
	
}

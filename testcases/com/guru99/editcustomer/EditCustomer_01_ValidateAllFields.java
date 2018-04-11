package com.guru99.editcustomer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BankGuru99.EditCustomerPageData;
import BankGuru99.NewCustomerPageData;
import commons.AbstractTest;
import commons.Constants;
import pages.GR_EditCustomerPage;
import pages.GR_HomePage;
import pages.GR_LoginPage;
import pages.GR_NewCustomerPage;
import pages.GR_PageFactory;

public class EditCustomer_01_ValidateAllFields extends AbstractTest {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browser, String url) throws Exception {

		driver = openBrowser(browser, url);

		// Case 1: return form driver (url -> go to LoginPage)
		loginPage = GR_PageFactory.getLoginPage(driver);
		userName = Constants.USERNAME;
		password = Constants.PASSWORD;
		loginPage.typetoUsername(userName);
		loginPage.typetoPassword(password);

		// Case 2 in LoginPage
		homePage = loginPage.clickToSubmitButton();

		// Case 3: in AbstractPage
	
//		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
//		
//		deleteCustomerPage = editCustomerPage.openDeleteCustomerPage(driver);
//		
//		homePage = deleteCustomerPage.openHomePage(driver);

	}

	@Test(enabled = false)
	public void TC_01_Customer_id_cannot_be_empty() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		editCustomerPage.clickToTextBox();
		editCustomerPage.typetoTabButton();
		editCustomerPage.checkEqualVerify(EditCustomerPageData.CUSTOMER_ID_ERROR_MSG);
	}
	@Test(enabled = false)
	public void TC_02_Customer_id_must_be_numeric() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(EditCustomerPageData.NUMBERS);
		editCustomerPage.checkEqualVerify(EditCustomerPageData.VERIFY_NUMBER_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_03_Customer_id_cannot_have_special_character() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(EditCustomerPageData.SPECIAL_TEXT);
		editCustomerPage.checkEqualVerify(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	@Test(enabled = false)
	public void TC_04_Valid_Customer_Id() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCustomerName(NewCustomerPageData.CUSTOMER_NAME);
		newCustomerPage.clickToRadio();
		newCustomerPage.typetoBirthDay(NewCustomerPageData.DATE_OF_BIRTH);
		newCustomerPage.typetoAddress(NewCustomerPageData.ADDRESS);
		newCustomerPage.typetoCity(NewCustomerPageData.CITY);
		newCustomerPage.typetoState(NewCustomerPageData.STATE);
		newCustomerPage.typetoPin(NewCustomerPageData.PIN);
		newCustomerPage.typetoTelephone(NewCustomerPageData.MOBILE);
		newCustomerPage.typetoEmail(NewCustomerPageData.EMAIL);
		newCustomerPage.typetoPassword(NewCustomerPageData.PASSWORD);
		newCustomerPage.clickToSubmit();
		newCustomerPage.getCustomerID();
		printCustomerID = newCustomerPage.getCustomerID();
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		System.out.println(printCustomerID);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
	}
	
	
	@Test(enabled = false)
	public void TC_05_Name_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoCustomerName();
	}
	
	@Test(enabled = false)
	public void TC_06_Name_cannot_be_numeric() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoNumericName(EditCustomerPageData.NUMBERS);
	}
	@Test(enabled = false)
	public void TC_07_Customer_id_cannot_have_special_character() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialName(EditCustomerPageData.SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_08_Address_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonAddress();
		editCustomerPage.checkEqualVerifyAddress(EditCustomerPageData.VERIFY_ADDRESS_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_09_City_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonCity();
		editCustomerPage.checkEqualVerifyCity(EditCustomerPageData.VERIFY_CITY_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_10_City_cannot_be_numeric() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoNumberCity(EditCustomerPageData.NUMBERS);
		editCustomerPage.checkEqualVerifyCity(EditCustomerPageData.VERIFY_NUMBER_EDIT_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_11_City_cannot_have_special_character() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialCity(EditCustomerPageData.SPECIAL_TEXT);
		editCustomerPage.checkEqualVerifyCity(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	@Test(enabled = false)
	public void TC_12_state_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonState();
		editCustomerPage.checkEqualVerifyState(EditCustomerPageData.VERIFY_STATE_TEXT);
	}
	@Test(enabled = false)
	public void TC_13_State_cannot_be_numeric() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoNumberState(EditCustomerPageData.NUMBERS);
		editCustomerPage.checkEqualVerifyState(EditCustomerPageData.VERIFY_NUMBER_EDIT_TEXT);
	}
	@Test(enabled = false)
	public void TC_14_State_cannot_have_special_character() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialState(EditCustomerPageData.SPECIAL_TEXT);
		editCustomerPage.checkEqualVerifyState(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_15_PIN_must_be_numeric() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoNumberPin(EditCustomerPageData.NUMBERS);
		editCustomerPage.checkEqualVerifyPin(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_16_PIN_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonPin();
		editCustomerPage.checkEqualVerifyPin(EditCustomerPageData.VERIFY_PIN_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_17_PIN_must_have_6_digits() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoNumberPin(EditCustomerPageData.NUMBERS_UNdDER_6_DIGITS);
		editCustomerPage.checkEqualVerifyPin(EditCustomerPageData.VERIFY_NUMBER_PIN_UNDER_6);
	}
	
	@Test(enabled = false)
	public void TC_18_PIN_cannot_have_special_character() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialPin(EditCustomerPageData.SPECIAL_TEXT);
		editCustomerPage.checkEqualVerifyPin(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_19_Telephone_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonMobile();
		editCustomerPage.checkEqualVerifyMobile(EditCustomerPageData.VERIFY_TELEPHONE_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_20_Telephone_cannot_have_special_character() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialPin(EditCustomerPageData.SPECIAL_TEXT);
		editCustomerPage.checkEqualVerifyPin(EditCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_21_Email_cannot_be_empty() {
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoTabButtonEmail();
		editCustomerPage.checkEqualVerifyEmail(EditCustomerPageData.VERIFY_EMAIL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_22_Email_must_be_in_format(){
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typetoSpecialEmail(EditCustomerPageData.INVALID_EMAIL);
		editCustomerPage.checkEqualVerifyEmail(EditCustomerPageData.VERIFY_EMAIL_SPECIAL_TEXT);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	private GR_LoginPage loginPage;
	private GR_HomePage homePage;
	
	private GR_NewCustomerPage newCustomerPage;
	private GR_EditCustomerPage editCustomerPage;
	private String userName, password, printCustomerID
	
	
	
	;
}

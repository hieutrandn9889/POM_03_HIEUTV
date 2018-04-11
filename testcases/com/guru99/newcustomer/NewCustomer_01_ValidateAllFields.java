package com.guru99.newcustomer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BankGuru99.NewCustomerPageData;
import commons.AbstractTest;
import commons.Constants;
import pages.GR_DeleteCustomerPage;
import pages.GR_EditCustomerPage;
import pages.GR_HomePage;
import pages.GR_LoginPage;
import pages.GR_NewCustomerPage;
import pages.GR_PageFactory;

public class NewCustomer_01_ValidateAllFields extends AbstractTest {
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
	}

	@Test(enabled = true)
	public void TC_01_NameCannotEmpty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToTextBox();
		newCustomerPage.typetoTabButton();
		newCustomerPage.checkEqualVerify(NewCustomerPageData.VERIFY_CUSTOMER_NAME_TEXT);
	}
	
	@Test(enabled = true)
	public void TC_02_Name_cannot_be_numeric() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCustomerName(NewCustomerPageData.NUMBERS);
		newCustomerPage.checkEqualVerify(NewCustomerPageData.VERIFY_NUMBER_NAME_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_03_Name_cannot_have_special_characters() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCustomerName(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerify(NewCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_04_Name_cannot_have_first_character_as_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCustomerName(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerify(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@Test(enabled = false)
	public void TC_05_Address_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToAddress();
		newCustomerPage.typetoTabButtonAdress();
		newCustomerPage.checkEqualVerifyAddress(NewCustomerPageData.VERIFY_ADDRESS_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_06_Address_cannot_have_first_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoAddress(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyAddress(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@Test(enabled = false)
	public void TC_07_City_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToCity();
		newCustomerPage.typetoTabButtonCity();
		newCustomerPage.checkEqualVerifyAddress(NewCustomerPageData.VERIFY_CITY_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_08_City_cannot_be_numeric() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCity(NewCustomerPageData.NUMBERS);
		newCustomerPage.checkEqualVerifyCity(NewCustomerPageData.VERIFY_NUMBER_NAME_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_09_City_cannot_have_sqecial() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCity(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerifyCity(NewCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	@Test(enabled = false)
	public void TC_10_City_cannot_have_first_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoCity(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyCity(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@Test(enabled = false)
	public void TC_11_State_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToCity();
		newCustomerPage.typetoTabButtonState();
		newCustomerPage.checkEqualVerifyState(NewCustomerPageData.VERIFY_STATE_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_12_State_cannot_be_numeric() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoState(NewCustomerPageData.NUMBERS);
		newCustomerPage.checkEqualVerifyState(NewCustomerPageData.VERIFY_NUMBER_NAME_TEXT);
	}
	@Test(enabled = false)
	public void TC_13_State_cannot_have_special_character() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoState(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerifyState(NewCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	@Test(enabled = false)
	public void TC_14_State_cannot_have_first_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoState(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyState(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	@Test(enabled = false)
	public void TC_15_PIN_must_be_numeric() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoPin(NewCustomerPageData.NUMBERS);
		newCustomerPage.checkEqualVerifyPin(NewCustomerPageData.VERIFY_NUMBER_PIN_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_16_PIN_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToPin();
		newCustomerPage.typetoTabButtonPin();
		newCustomerPage.checkEqualVerifyPin(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@Test(enabled = false)
	public void TC_17_PIN_must_have_6_digits() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoPin(NewCustomerPageData.NUMBERS_UNdDER_6_DIGITS);
		newCustomerPage.checkEqualVerifyPin(NewCustomerPageData.VERIFY_NUMBER_PIN_UNDER_6);
	}
	@Test(enabled = false)
	public void TC_18_PIN_cannot_have_special_character() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoPin(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerifyPin(NewCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	@Test(enabled = false)
	public void TC_19_PIN_cannot_have_first_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoPin(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyPin(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@Test(enabled = false)
	public void TC_21_Telephone_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToTelephone();
		newCustomerPage.typetoTabButtonTelephone();
		newCustomerPage.checkEqualVerifyTelephone(NewCustomerPageData.VERIFY_TELEPHONE_TEXT);
	}
	@Test(enabled = false)
	public void TC_22_Telephone_cannot_have_first_character_as_blank_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoTelephone(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyTelephone(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	@Test(enabled = false)
	public void TC_24_Telephone_cannot_have_special_character() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoTelephone(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerifyTelephone(NewCustomerPageData.VERIFY_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_25_Email_cannot_be_empty() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.clickToEmail();
		newCustomerPage.typetoTabButtonEmail();
		newCustomerPage.checkEqualVerifyEmail(NewCustomerPageData.VERIFY_EMAIL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_26_Email_must_be_incorrect_format() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoEmail(NewCustomerPageData.SPECIAL_TEXT);
		newCustomerPage.checkEqualVerifyEmail(NewCustomerPageData.VERIFY_EMAIL_SPECIAL_TEXT);
	}
	
	@Test(enabled = false)
	public void TC_27_Email_cannot_have_space() {
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.typetoEmail(NewCustomerPageData.FISRT_CHARACTER);
		newCustomerPage.checkEqualVerifyEmail(NewCustomerPageData.VERIFY_FIRST_CHARACTER);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private GR_LoginPage loginPage;
	private GR_HomePage homePage;
	private GR_NewCustomerPage newCustomerPage;
	private String userName, password ;
	
}

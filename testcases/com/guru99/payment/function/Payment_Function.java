package com.guru99.payment.function;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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
import pages.GR_NewAccountPage;
import pages.GR_NewCustomerPage;
import pages.GR_PageFactory;

public class Payment_Function extends AbstractTest{
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
	
	@Test(enabled = false)
	public void TC_01_Create_new_customer_account_and_check_created_successfully(){
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
		newCustomerPage.checkEqualVerifyCutomerRegisterSuccess("Customer Registered Successfully!!!");
	}
	
	@Test(enabled = false)
	public void TC_02_Edit_customer_account_and_check_edited_successfully(){
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
		printCustomerID = newCustomerPage.getCustomerID();
		System.out.println(printCustomerID);
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		editCustomerPage.typetoCustomerID(printCustomerID);
		editCustomerPage.clickToSubmitButton();
		editCustomerPage.typeToEditElementAddress(EditCustomerPageData.EditAdress);
		editCustomerPage.typeToEditElementCity(EditCustomerPageData.EditCity);
		editCustomerPage.typeToEditElementState(EditCustomerPageData.EditState);
		editCustomerPage.typeToEditElementPin(EditCustomerPageData.EditPin);
		editCustomerPage.typeToEditElementMobile(EditCustomerPageData.EditMobile);
		editCustomerPage.typeToEditElementEmail(EditCustomerPageData.EditEmail);
		editCustomerPage.clickToSubmitButtonEdited();
		editCustomerPage.checkEqualVerifyEditSuccess("Customer details updated Successfully!!!");
	}
	
	@Test(enabled = true)
	public void TC_03_Add_new_account(){
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
		printCustomerID = newCustomerPage.getCustomerID();
		System.out.println(printCustomerID);
		newAccountPage = newCustomerPage.openNewAccountPage(driver);
		newAccountPage.getCustomerID();
		
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	private GR_LoginPage loginPage;
	private GR_HomePage homePage;
	private GR_NewCustomerPage newCustomerPage;
	private GR_EditCustomerPage editCustomerPage;
	private GR_NewAccountPage newAccountPage;
	private String userName, password, printCustomerID;
}

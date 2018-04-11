package BankGuru99;

import java.util.Random;

public class NewCustomerPageData {
	public static final String VERIFY_CUSTOMER_NAME_TEXT = "Customer name must not be blank";
	public static final String VERIFY_NUMBER_NAME_TEXT = "Numbers are not allowed";
	public static final String VERIFY_SPECIAL_TEXT = "Special characters are not allowed";
	public static final String VERIFY_FIRST_CHARACTER = "First character can not have space";
	public static final String VERIFY_ADDRESS_TEXT = "Address Field must not be blank";
	public static final String VERIFY_CITY_TEXT = "City Field must not be blank";
	public static final String VERIFY_STATE_TEXT = "State must not be blank";
	public static final String VERIFY_TELEPHONE_TEXT = "Mobile no must not be blank";
	public static final String VERIFY_NUMBER_PIN_TEXT = "Characters are not allowed";
	public static final String VERIFY_NUMBER_PIN_UNDER_6 = "PIN Code must have 6 Digits";
	public static final String VERIFY_EMAIL_TEXT = "Email-ID must not be blank";
	public static final String VERIFY_EMAIL_SPECIAL_TEXT = "Email-ID is not valid";
	public static final String NUMBERS = "NAME123";
	public static final String NUMBERS_UNdDER_6_DIGITS = "123";
	public static final String SPECIAL_TEXT = "NAME@";
	public static final String FISRT_CHARACTER = " 123";
	public static final String CUSTOMER_NAME = "AUTOMATION TESTING";
	public static final String DATE_OF_BIRTH = "01/01/1989";
	public static final String ADDRESS = "PO Box 911 8331 Duis Avenue";
	public static final String CITY = "Tampa";
	public static final String STATE = "FL";
	public static final String PIN = "466250";
	public static final String MOBILE = "4555442476";
	public static final String FIRST_NAME = "automation";
	public static final String LAST_NAME = "@gmail.com";
	public static final String PASSWORD = "automation";
	public static final String EMAIL = FIRST_NAME + ranDomEmail() + LAST_NAME;
	
	
	public static int ranDomEmail() {
		Random rand = new Random();
		int number = rand.nextInt(99999) + 1;
		return number;
	}
	
}

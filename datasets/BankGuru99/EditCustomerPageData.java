package BankGuru99;

import java.util.Random;

public class EditCustomerPageData {
	public static final String CUSTOMER_ID_ERROR_MSG = "Customer ID is required";
	public static final String CUSTOMER_NAME_ERROR_MSG = "Name cannot be empty";
	public static final String VERIFY_NUMBER_TEXT = "Characters are not allowed";
	public static final String VERIFY_SPECIAL_TEXT = "Special characters are not allowed";
	public static final String VERIFY_FIRST_CHARACTER = "First character can not have space";
	public static final String VERIFY_ADDRESS_TEXT = "Address Field must not be blank";
	public static final String VERIFY_CITY_TEXT = "City Field must not be blank";
	public static final String VERIFY_NUMBER_EDIT_TEXT = "Numbers are not allowed";
	public static final String VERIFY_STATE_TEXT = "State must not be blank";
	public static final String VERIFY_PIN_TEXT = "PIN Code must not be blank";
	public static final String VERIFY_TELEPHONE_TEXT = "Mobile no must not be blank";
	public static final String VERIFY_NUMBER_PIN_TEXT = "Characters are not allowed";
	public static final String VERIFY_NUMBER_PIN_UNDER_6 = "PIN Code must have 6 Digits";
	public static final String VERIFY_EMAIL_TEXT = "Email-ID must not be blank";
	public static final String VERIFY_EMAIL_SPECIAL_TEXT = "Email-ID is not valid";
	public static final String NUMBERS = "NAME123";
	public static final String NUMBERS_UNdDER_6_DIGITS = "123";
	public static final String SPECIAL_TEXT = "NAME@";
	public static final String FISRT_CHARACTER = " 123";
	public static final String INVALID_EMAIL = "guru99@gmail";
	public static final String EditAdress = "1883 Cursus Avenue";
	public static final String EditCity = "Houston";
	public static final String EditState = "Texas";
	public static final String EditPin = "166455";
	public static final String EditMobile = "4779728081";
	public static final String EditfirstName = "testing";
	public static final String lastName = "@gmail.com";
	public static final String EditEmail = EditfirstName + ranDomEmail() + lastName;
	
	public static int ranDomEmail() {
		Random rand = new Random();
		int number = rand.nextInt(99999) + 1;
		return number;
	}
}

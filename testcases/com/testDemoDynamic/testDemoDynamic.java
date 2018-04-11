
package com.testDemoDynamic;
import org.openqa.selenium.WebDriver;
public class testDemoDynamic {
	static WebDriver driver;

	static String locator = "//label[@id='message9' and contains(text(), '%s')]";
	static String message = "Email-ID must not be blank";

	public static void main(String[] args) {
		isControlDisplayed(locator, message);
	}

	public static void isControlDisplayed(String locator, String value) {
		String specialControl = String.format(locator, value);
		System.out.println(specialControl);
	}
}

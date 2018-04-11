package commons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BankGuru99.AbstractPageUI;
import pages.GR_DeleteCustomerPage;
import pages.GR_EditCustomerPage;
import pages.GR_HomePage;
import pages.GR_NewAccountPage;
import pages.GR_NewCustomerPage;
import pages.GR_PageFactory;

public class AbstractPage {
	WebDriver driver;
	
	public void clickToElement(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		element.click();
	}
	public void clickToElementDynamic(WebDriver driver, String controlName, String value){
		String newLocator = String.format(controlName, value);
		WebElement element = driver.findElement(By.xpath(newLocator));
		element.click();
	}
	
	public void selectToElement(WebDriver driver, String controlName, String value) {
		Select oSelect = new Select(driver.findElement(By.xpath(controlName)));
		oSelect.selectByVisibleText(value);
	}
	
	public String getTextElement(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		return element.getText();
	}

	public void sendKeysToElement(WebDriver driver, String controlName, String value) {
		WebElement element = driver.findElement(By.xpath(controlName));
		element.clear();
		element.sendKeys(value);
	}
	
	public void sendKeysToElementJavascriptTabButton(WebDriver driver, String controlName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(controlName));
		js.executeScript( "arguments[0].removeAttribute('disabled')" ,element );
		element.clear();
		element.sendKeys(Keys.TAB);
	}
	
	public void sendKeysToElementJavascriptNumber(WebDriver driver, String controlName, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(controlName));
		js.executeScript( "arguments[0].removeAttribute('disabled')" ,element );
		element.clear();
		element.sendKeys(value);
	}
	
	public void sendKeysToElementJavascriptSpecial(WebDriver driver, String controlName, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(controlName));
		js.executeScript( "arguments[0].removeAttribute('disabled')" ,element );
		element.clear();
		element.sendKeys(value);
	}
	
	public void sendKeysToTabButton(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		element.sendKeys(Keys.TAB);
	}
	
	public void sendKeysToClearAndTabButton(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		element.clear();
		element.sendKeys(Keys.TAB);
	}

	public String getTitlePage(WebDriver driver) {
		return driver.getTitle();
	}

	public void checkToCheckbox(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		try {
			Assert.assertTrue(element.isSelected());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkEqualString(WebDriver driver, String controlName, String value) {
		WebElement element = driver.findElement(By.xpath(controlName));
		String getElement = element.getText();
		try {
			Assert.assertEquals(getElement, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void isControlDisplayed(WebDriver driver, String controlName, String value){
		String newLocator = String.format(controlName, value);
		WebElement element = driver.findElement(By.xpath(newLocator));
		element.isDisplayed();
	}

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void selectDropdownList(WebDriver driver, String controlName, String value) {
		Select select = new Select(driver.findElement(By.xpath(controlName)));
		select.selectByVisibleText(value);
	}

	public void verifyDropdownSelected(WebDriver driver, String controlName, String value) {
		Select select = new Select(driver.findElement(By.xpath(controlName)));
		String text = select.getFirstSelectedOption().getText();
		try {
			Assert.assertTrue(text.equals(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickToCheckBoxOrRadioButton(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void doubleClick(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void rightClick(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void hoverToElement(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public boolean isControlDisplayed(WebDriver driver, String controlName) {
		WebElement element = driver.findElement(By.xpath(controlName));
		return element.isDisplayed();
	}

	public void waitForControlVisible(WebDriver driver, final String controlName, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(controlName)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void robotClassSimulatorTabButton(WebDriver driver) {
		try {
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isControlSelected(WebDriver driver, String controlName){
		WebElement element = driver.findElement(By.xpath(controlName));
		return element.isSelected();
	}
	
	public void selectDropdown(WebDriver driver, String controlName, String value){
		Select select = new Select(driver.findElement(By.xpath(controlName)));
		select.selectByValue(value);
	}
	
	public String getFirtstSelectedInDropdown(WebDriver driver, String controlName){
		Select select = new Select(driver.findElement(By.xpath(controlName)));
		return select.getFirstSelectedOption().getText();
	}

	// GR
	public GR_NewCustomerPage openNewCustomerPage(WebDriver driver) {
		clickToElementDynamic(driver, AbstractPageUI.DYNAMIC_MENU_PAGE, "New Customer" );
		return GR_PageFactory.getNewCustomerPage(driver);
	}

	public GR_EditCustomerPage openEditCustomerPage(WebDriver driver) {
		clickToElementDynamic(driver, AbstractPageUI.DYNAMIC_MENU_PAGE, "Edit Customer");
		return GR_PageFactory.getEditCustomerPage(driver);
	}

	public GR_DeleteCustomerPage openDeleteCustomerPage(WebDriver driver) {
		clickToElementDynamic(driver, AbstractPageUI.DYNAMIC_MENU_PAGE, "Delete Customer");
		return GR_PageFactory.getDeleteCustomerPage(driver);
	}
	
	public GR_NewAccountPage openNewAccountPage(WebDriver driver) {
		clickToElementDynamic(driver, AbstractPageUI.DYNAMIC_MENU_PAGE, "New Account");
		return GR_PageFactory.getNewAccountPage(driver);
	}

	public GR_HomePage openHomePage(WebDriver driver) {
		clickToElementDynamic(driver, AbstractPageUI.DYNAMIC_MENU_PAGE, "Manager");
		return GR_PageFactory.getHomePage(driver);
	}
	
	

}

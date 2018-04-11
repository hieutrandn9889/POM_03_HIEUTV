package com.zingpoll.register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register_01_RegisterToZingPollSite {
	WebDriver driver;

	@Test
	public void TC_001() {
		System.out.println("tesed");
		System.out.println("tesed1");
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}

package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initializaion();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void titleCheck() {
		String title = loginPage.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	
	@Test(priority = 2)
	public void logoAvailableCheck() 
	{
		Assert.assertFalse(loginPage.isLogoPresent());
	}
	
	@Test(priority = 2)
	public void login() {
		loginPage.login();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

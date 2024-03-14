package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AdminPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	public DashboardPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initializaion();
		loginPage = new LoginPage();
		dashboardPage = loginPage.login();

	}
	
	
	@Test(priority = 1)
	public void verifyDashboardUsername() {
		String un = dashboardPage.getUserName();
		Assert.assertEquals(un, "Vei Chance");
	}
	
	@Test(priority = 2)
	public AdminPage navigateToAdmin() {
		dashboardPage.gotoAdminPage();
		return new AdminPage();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

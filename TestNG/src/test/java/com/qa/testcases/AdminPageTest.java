package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AdminPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;

public class AdminPageTest extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	
	public AdminPageTest() {
		super();
	}
	

	@BeforeMethod
	public void setUp() {
		initializaion();
		loginPage = new LoginPage();
		dashboardPage = loginPage.login();
		adminPage = dashboardPage.gotoAdminPage();
		adminPage.addNewAdmin();

	}
		
	@Test
	public void addNewADminForm() throws InterruptedException {
		adminPage.createAdmin();
	}
}

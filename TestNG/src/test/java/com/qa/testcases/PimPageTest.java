package com.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PimPage;
import com.qa.util.TestUtil;

public class PimPageTest extends TestBase {

	LoginPage login;
	DashboardPage dashboard;
	PimPage pimPage;
	TestUtil data;

	public PimPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initializaion();
		login = new LoginPage();
		dashboard = login.login();
		pimPage = dashboard.gotoPimPage();
	}

	@DataProvider(name = "sheetData")
	public Object[][] dataProviderFromUtilClass() throws InvalidFormatException, IOException {
		TestUtil data = new TestUtil();
		System.out.println(data);
		return data.provideTestData();
	}

	@Test(dataProvider = "sheetData")
	public void fillForm(String firstName, String middleName, String lastName, String dl, String month, String year, String date) throws InterruptedException {
		pimPage.fillFrom(firstName, middleName, lastName, dl,month,year , date);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}

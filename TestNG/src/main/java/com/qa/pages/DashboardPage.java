package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//*[@class=\"oxd-userdropdown-name\"]")
	WebElement userName;

	@FindBy(xpath = "//*[@class=\"oxd-main-menu-search\"]//following::a[1]")
	WebElement admin;

	@FindBy(xpath = "//*[@class=\"oxd-main-menu-search\"]//following::a[2]")
	WebElement PIM;

	@FindBy(xpath = "//*[@class=\"oxd-main-menu-search\"]//following::a[3]")
	WebElement leave;

	@FindBy(xpath = "//*[@class=\"oxd-main-menu-search\"]//following::a[4]")
	WebElement time;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public String getUserName() {
		return userName.getText();
	}
	

	public AdminPage gotoAdminPage() {
		admin.click();
		return new AdminPage();
	}

	public PimPage gotoPimPage() {
		PIM.click();
		return new PimPage();
	}
	
	public LeavePage leavePage() {
		leave.click();
		return new LeavePage();
	}
	
	public TimePage timePage() {
		leave.click();
		return new TimePage();
	}
	
}

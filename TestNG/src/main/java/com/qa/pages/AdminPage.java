package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AdminPage extends TestBase {

	@FindBy(xpath = "//*[@class=\"oxd-userdropdown-name\"]")
	WebElement adminUserName;

	@FindBy(xpath = "//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement addBtn;

	@FindBy(xpath = "(//*[@class=\"oxd-select-text-input\"])[1]")
	WebElement userRoleDropdown;

	@FindBy(xpath = "//*[@placeholder=\"Type for hints...\"]")
	WebElement employeeName;

	@FindBy(xpath = "(//*[@class=\"oxd-select-text-input\" and @tabindex=\"0\"])[2]")
	WebElement statusAdmin;

	@FindBy(xpath = "(//*[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement newAdminUserName;

	@FindBy(xpath = "(//*[@type=\"password\"])[1]")
	WebElement NewPassword;

	@FindBy(xpath = "(//*[@type=\"password\"])[2]")
	WebElement confirmPassword;

	@FindBy(xpath = "//*[@type=\"submit\"]")
	WebElement submitBtn;

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	public void addNewAdmin() {
		addBtn.click();
	}

	public void selectAdminUserRole() {
		userRoleDropdown.click();
		userRoleDropdown.sendKeys(Keys.ARROW_DOWN);
		userRoleDropdown.sendKeys(Keys.ENTER);
	}

	public void selectStatus() {
		statusAdmin.click();
		statusAdmin.sendKeys(Keys.ARROW_DOWN);
		statusAdmin.sendKeys(Keys.ENTER);
	}

	public void selectEmployeeName() throws InterruptedException {
		employeeName.click();
		employeeName.sendKeys("bob");
		Thread.sleep(3000);
		employeeName.sendKeys(Keys.ARROW_DOWN);
		employeeName.sendKeys(Keys.ENTER);
	}

	public void enterUserName() {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String fileName = "Emp" + timeStamp + "";
		newAdminUserName.sendKeys(fileName);

	}

	public void createAdmin() throws InterruptedException {
		selectAdminUserRole();
		selectEmployeeName();
		selectStatus();
		enterUserName();
		NewPassword.sendKeys("Itspark@24");
		confirmPassword.sendKeys("Itspark@24");
		submitBtn.click();
	}
}

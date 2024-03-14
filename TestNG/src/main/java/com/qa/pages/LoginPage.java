package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	@FindBy(name = "username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//*[@type=\"submit\"]")
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/img")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public DashboardPage login() {
		name.sendKeys(prob.getProperty("username"));
		password.sendKeys(prob.getProperty("password"));
		submitBtn.click();
		return new DashboardPage();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public Boolean isLogoPresent() {
		return logo.isDisplayed();
	}
	
}

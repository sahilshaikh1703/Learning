package com.qa.pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class PimPage extends TestBase {

	@FindBy(xpath = "//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement addBtn;

	@FindBy(name = "firstName")
	WebElement fname;

	@FindBy(name = "middleName")
	WebElement mname;

	@FindBy(name = "lastName")
	WebElement lname;

	@FindBy(xpath = "//*[@type=\"submit\"]")
	WebElement submitBtn;

	@FindBy(xpath = "(//*[@class=\"oxd-input oxd-input--active\"])[3]")
	WebElement drivingLicense;

	@FindBy(xpath = "(//*[@placeholder=\"yyyy-dd-mm\"])[2]")
	WebElement dob;

	@FindBy(xpath = "(//*[@class=\"oxd-input oxd-input--active\"])[3]")
	WebElement otherID;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

	public void dateOfBirth(String year, String month, String date) throws InterruptedException {
		System.out.println("Selection DOB ");
		dob.click();
		Thread.sleep(3000);
		String currentmonth = driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[1]")).getText();
		String currentyear = driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[2]")).getText();
		System.out.println("1st currentmonth : " + currentmonth);
		System.out.println("1st Curent year : " + currentyear);
		System.out.println("Sheet Month 1st  " + month);
		System.out.println("Sheet Year 1st " + year);

		while (!(currentmonth.equals(month) && currentyear.equals(year))) {
			System.err.println("Inside Methods");
			driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
			currentmonth = driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[1]")).getText();
			currentyear = driver.findElement(By.xpath("(//*[@class=\"oxd-text oxd-text--p\"])[2]")).getText();
			System.out.println("Current month " + currentmonth + " Users DOB month:  " + month);
			System.out.println("Current year" + currentyear + "users DOB year" + year);
			System.out.println("users DOB date" + date);
		}
		System.out.println("Clicking date now ");
		driver.findElement(By.xpath("//*[text()='" + date + "']")).click();
		

	}

	public void fillFrom(String firstName, String middleName, String lastName, String dl, String year, String month,
			String date) throws InterruptedException {

		addBtn.click();
		fname.sendKeys(firstName);
		mname.sendKeys(middleName);
		lname.sendKeys(lastName);
		submitBtn.click();
		Thread.sleep(5000);
		dateOfBirth(month, year, date);
		otherID.sendKeys("12345");
		drivingLicense.sendKeys(dl);
		submitBtn.click();
		
	}

}

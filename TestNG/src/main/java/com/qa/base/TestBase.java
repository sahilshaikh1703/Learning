package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prob;

	public TestBase() {

		prob = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties");
			prob.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initializaion() {
		String browserName = prob.getProperty("browser");

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equals("ff")) {
			driver = new FirefoxDriver();

		} else
			System.out.println("Ivalid browser Name entered ");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(com.qa.util.TestUtil.implicitwait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(com.qa.util.TestUtil.pagetimeoutwait, TimeUnit.SECONDS);

		driver.get(prob.getProperty("url"));
	}
	
	

}

package myMavenProject.myMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("This is the @test condition - 1 ");

		WebDriver driver	= new FirefoxDriver(); 
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is the @BeforeMethod condition - 2 ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the @AfterMethod condition - 3 ");

  }

  @BeforeClass
  public void beforeClass() {
  System.out.println("This is the @BeforeClass condition - 4 ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is the @Afterlass condition - 5 ");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the @BeforeTest condition - 6 ");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the @AfterTest condition - 7 ");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the @BeforeSuite condition - 8 ");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the @AfterSuite condition - 9 ");

  }

}

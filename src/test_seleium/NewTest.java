package test_seleium;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Google");
		// THIS IS TEST FUNCTION
	  
  }
  @BeforeClass
  public void beforeClass() {
	  	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
<<<<<<< HEAD
		// CHANGE FILE NEWTEST
=======
		System.out.print("hello test automation");		
>>>>>>> branch 'master' of https://github.com/minhtrang1788/testAutomationlink
		// Firefox
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}

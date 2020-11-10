package TestNGConcepts;

/**
 * 
 * 
 * @author jey
 * 
 * Before Suite will always execute prior to all annotations or tests in the suite
 * Before Test will always execute prior to Before Class, ,Before Method and Test Method
Before Class will always execute prior to Before Method and Test Method
Before Method will execute before every test method
This is the First Test Case 1
After Method will execute after every test method
Before Method will execute before every test method
This is the Second Test Case 2
After Method will execute after every test method
After Class will always execute later to After Method and Test method
After Test will always execute later to After Method, After Class
 *
 *
 *
 *before suite annotations always before test will execute 
 *
 *in testNG if there no priority method 
 *all the tests will execute with alphabetic order 
 *if there @before test annotations the browser will exetue once and all the tests will execute 
 *in same browser 
 *
 *but with @beforeMethod browser will execute with number of test cases 
 *it means how many test cases you have it will execute 
 *
 *we can define priority as  -1 it will execute first 
 *if we have priority and non priority based test methods first non priority based test methods execute first 
 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgSelenium {

	WebDriver driver;

	@BeforeMethod
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();

		driver.get("https://app.hubspot.com/login");
	}

	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("login page titls is: " + title);
		AssertJUnit.assertEquals(title, "HubSpot Login");
	}

	@Test(priority = 1)
	public void verifySignUpLinkTest() {
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("Ali-ceyhun@list.ru");
		driver.findElement(By.id("password")).sendKeys("hubspot123456789");
		driver.findElement(By.id("loginBtn")).click();
	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
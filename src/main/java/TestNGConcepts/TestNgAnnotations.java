package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	// Before
	// test
	// After
	
	/*
	 *  connect With DB --BS
		create user --BT
		launch browser --BC

			login to app --BM
				veirfyTitleTest --T1
			logout --AM

			login to app --BM
				verifyLoggedInUser --T2
			logout --AM

		closeBrowser --AC
		delete user --AT
		disconnectDB --AS
	 */

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("connect With DB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("create user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("login to app");
	}

	@Test
	public void veirfyTitleTest() {
		System.out.println("veirfyTitleTest");
	}

	@Test
	public void verifyLoggedInUser() {
		System.out.println("verifyLoggedInUser");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("delete user");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnectDB");
	}

}

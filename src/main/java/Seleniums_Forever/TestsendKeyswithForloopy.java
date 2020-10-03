package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsendKeyswithForloopy {

	public static void main(String[] args) {

		WebElementUtil u;
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		u = new WebElementUtil(driver);
		driver.get("https://app.hubspot.com/login");
		
		String title = u.waitForContainsTitleToBePresent("Login", 6);
		System.out.println(title);
		By username = By.id("username");
		
		u.isElementDisplayed_ThenSendKEYS(username, 6, "jeyhun");
		
		
		/**
		 * this method here contacted with utility class which is sending keys without any in build method 
		 * just using for loop 
		 * .isDisplayed method and passing parameters
		 */
	}

}

package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlywaitCustom {

	static WebDriver driver;
	static WebElementUtil util;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new WebElementUtil(driver);
		driver.get("https://app.hubspot.com/login/");
	    util.waitFor_Full_TitleToBePresent("HubSpot Login", 7);
		System.out.println(driver.getTitle());

		By email = By.cssSelector("#username");

		customTryingElement(email).sendKeys("jeyhun");

	}

	public static WebElement customTryingElement(By Locator) {
		WebElement element = null;
		int attempts = 1;

		while (attempts < 30) {

			try {
				element = driver.findElement(Locator);
				break;

			} catch (Exception e) {

				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {

				}
				// System.out.println("found after attempt number " + attempts);
			}
			attempts++;

		}
		System.out.println("element found after attempt number " + attempts);

		return element;
	}

}
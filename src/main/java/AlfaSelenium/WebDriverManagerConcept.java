package AlfaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browser = "Safari";

		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("fireFox"))	{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else if(browser.equalsIgnoreCase("Safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();

		}
		else {
			System.out.println(browser + "browser not found");

		}

		driver.get("https://www.google.com/");

		String title = driver.getTitle();

		System.out.println("The title of the page is: " + title);






	}

}

package Seleniums_Forever;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Cross_Browser {

	static WebDriver driver;


	public static void main(String[] args) {

		String browser = "safari";

		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "driver path has to be here");
			driver = new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "driver path has to be here");
			driver = new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("safari")){
			driver = new SafariDriver();
		}

		else{
			System.out.println("Please pass the correct browser name... " + browser);
		}

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		driver.quit();
		


	}




}



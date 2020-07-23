package AlfaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilityconsept {
	/**
	 * in this class im creating initialize util method everytime when i need 
	 * to launch the browser i have to call this method 
	 * to initialize my browser and pass the browser name  
	 */

	WebDriver driver ;

	public WebDriver initializing_Driver(String browserName) {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
			break;

		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();		
			break;

		default:
			System.out.println(browserName + " browser is not found");
			break;
		}

		return driver;
	}


	public void launchingUrl(String url) {
		driver.get(url);
	}

	public String doGetTitleOfPage() {
		return driver.getTitle();
	}

    public String doGetCurrentUrl() {
		return driver.getCurrentUrl();
	}

public void doQuitBrowser() {
	driver.quit();
}
  
}	



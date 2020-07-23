package AlfaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChrome {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/jey/Desktop/driver/chromedriver");
		
		//System.setProperty("webdriver.gecko.driver", "/Users/jey/Desktop/driver/geckodriver");

		//WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();	
		
		System.out.println("the title of the page is:" + title);
		
		
		
		
		
		
	}

}

package Seleniums_Forever;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * 
 * @author jey 
 * differences between get and navigate is 
 * get is waiting at least some second to load page fully then 
 * but navigate dont wait not even second 
 * navigate is perfect to navigate to another web page to check if its perfectly moving back and forward
 *
 */

public class NavigationConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());

		//back and forward BUTTON simulation
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//refresh the browser:
		driver.navigate().refresh();
		
		driver.quit();

	}

}



package AlfaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {

	/**
	 * 
	 * 
	 * @param args
	 * 
	 * it means along with the url we have to pass username and password 
	 * shown below how to do that 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	//1st way 	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		String textTitle = driver.getTitle();
		
		System.out.println(textTitle);
		
		
		
		
		
		
		
		
		
		
	}

}

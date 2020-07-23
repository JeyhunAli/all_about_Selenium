package AlfaSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSpopUpHandling {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String textTitle = driver.getTitle();
		
		if(textTitle.equals(textTitle)) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		driver.findElement(By.name("proceed")).click();
		
		
		/**
		 * this is just JS pop up for that we have method name is Alert 
		 * driver.switch to alert method we can capture the text of 
		 * alert and also we can accept and dismiss the alert 
		 */
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		
		
		
	}

}

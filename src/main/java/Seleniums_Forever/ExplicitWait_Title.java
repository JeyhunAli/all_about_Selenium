package Seleniums_Forever;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Title {

	public static void main(String[] args) {

		
		//ExplicitWait :
		//1. WebDriverWait internally extending fluentwait 
		//2. FluentWait is super class of the webdriverwait
		/**
		 * WebDriverWait/Explicitly wait is not global wait but implicitly wait is global
		 * 
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		System.out.println(driver.getTitle());
		
		
	}

}
package Seleniums_Forever;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	/**
	 * 
	 * why we are using window handles method to switch from one window to another
	 * because every window has its own window id and thats hidden we cannot inspect
	 * and get it only window handles method helps to handle it
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/");
		

		
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
			
		// driver.findElement(By.cssSelector("svg.eapp-popup-control-close-icon")).click();			
			//driver.findElement(By.xpath("//div[text()='Click here']")).click();
	}

}

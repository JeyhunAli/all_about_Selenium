package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassInSelenium_2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(4000);
		
		WebElement list = driver.findElement(By.id("nav-link-accountList"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(list).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Your Kindle Unlimited")).click();
		/**
		 * always keep in the mind if if some element written in uppercase in dom and 
		 * same element in lower case in web page select whatever written in webpage
		 */
		
		
		
		
		
	}

}

package Seleniums_Forever;

import java.time.Duration;

/**
 * differences with fluent wait and webdriver wait 
 * is fluent wait is providing on the fly polling concept and ignoring concept 
 * ignoring any kind of exception 
 * 
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import ConstantUtil.ConstantUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static WebDriver driver;
	private static WebElementUtil util;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new WebElementUtil(driver);
		driver.get(ConstantUtility.UrL);
		String title = driver.getTitle();
		if (title.contains(ConstantUtility.title)) {
			System.out.println("correct title is: " + title);
		} else {
			System.out.println("please pass correct title..... " + title);

		}

		By brokenImages = By.linkText("Broken Images");
	WebElement brokenL = presenceOfElementwith_FluentWait(brokenImages);
	brokenL.click();
		
		
		
		
	}

	public static WebElement presenceOfElementwith_FluentWait(By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}

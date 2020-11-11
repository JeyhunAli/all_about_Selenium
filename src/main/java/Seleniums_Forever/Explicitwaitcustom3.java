package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitcustom3 {

	public static WebDriver driver;
	private static WebElementUtil util;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new WebElementUtil(driver);
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if (title.contains("Google")) {
			System.out.println("correct title is: " + title);
		} else {
			System.out.println("please pass correct title..... " + title);

		}

		By googleSearch = By.xpath("//input[@name='q']");
		util.customAttemptElement(googleSearch).sendKeys("Kharabakh is Azerbijan");

	}

//	public static WebElement customAttemptElement(By locator) {
//
//		WebElement element = null;
//		int attempts = 0;
//
//		while (attempts < 30) {
//
//			try {
//				element = driver.findElement(locator);
//				break;
//			} catch (Exception e) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e1) {
//				}
//			}
//
//			attempts++;
//		}
//		System.out.println("element found after attempt number " + attempts);
//		return element;
//
//	}

}

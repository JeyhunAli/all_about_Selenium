package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author jey
 * in this code im explaning how to do send keys click by actions class 
 * 
 * differences between normal send keys and click 
 * with action is 
 * normal sendkeys and click is just clicking and sending keys 
 * but action sendkeys and click is moving exactly middle of the element then performing acting 
 *
 */

public class ActionClassInSelenium_4 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");

		Thread.sleep(6000);

		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));

		Actions actions = new Actions(driver);
		actions.sendKeys(username, "Ali-ceyhun@list.ru").build().perform();
		actions.sendKeys(password, "Asderfgty5758").build().perform();
		actions.click(loginbutton).build().perform();

	}

}

package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author jey
 *keep in the mind 
 *most of the time i would say almost all the time when you work with dom whatever element link written on ui part choose that one 
 *because some element on the page written with capital letter and on dom they written with small letter always go for 
 *with dom structure 
 *but sometimes it works as it written in ui page so if either ofthem not working 
 *try another way 
 */

public class MoveToElement2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");
		
		WebElementUtil u = new WebElementUtil(driver);

		Thread.sleep(2000);
		
		By menulink = By.className("menulink");
		//By singlevideos = By.linkText("SINGLE VIDEOS");
		By singlevideos = By.xpath("//a[contains(text(),'Single Videos')]");

		
		u.domoveToElement(menulink);
		u.DoActionClick(singlevideos);
		
		
		
		
		
		
		

//		WebElement menulink = driver.findElement(By.className("menulink"));
//
//		Actions action = new Actions(driver);
//
//		action.moveToElement(menulink).build().perform();

	}

}

package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author jey
 * 
 * in this im using findelements method to capture all the elements in right click 
 * then printing all of them then with the help of the if else condititon clicking the element 
 * and ofcourse using actions class and context click in selenium 
 *
 */

public class ActionClassInSelenium_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightclick = driver.findElement(By.cssSelector("span.context-menu-one.btn.btn-neutral"));

		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();

		List<WebElement> listOfRightClick = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"
				+ "/li[contains(@class,'context-menu-icon')]"));

		System.out.println(listOfRightClick.size());

		for(int i=0; i<listOfRightClick.size(); i++){
			String text = listOfRightClick.get(i).getText();
			System.out.println(text);
			if(text.equals("Paste")) {
				listOfRightClick.get(i).click();
				break;



			}

		}	



	}

}

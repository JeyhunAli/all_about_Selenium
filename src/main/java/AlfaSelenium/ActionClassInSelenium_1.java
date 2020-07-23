package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassInSelenium_1 {
	
	/**
	 * 
	 * @param args
	 * action class in selenium special class which is responsible actions
	 * such as drag and drop, right click, double click, movetoelement, click, sendkeys,
	 * always passing driver while creating object of the actions class
	 * in actions class .build .perform is impoertant 
	 * if not passing the actions will never happen .
	 * actions are there but happening 
	 * 
	 * another concept if you have only one action in actions class 
	 * then if you use only perform without 
	 * build it will work
	 * althought it will work with multiple actions without build method just perform 
	 * but it might be not work in other browsers
	 * its always best experience use .build.perform
	 * 
	 */

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		
	WebElement sourceEle = driver.findElement(By.id("draggable"));
	WebElement targetEle =	driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
	//	same action element
	//	action.dragAndDrop(sourceEle, targetEle).build().perform();
		
		action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
		
		
		
		
		
		
	}

}

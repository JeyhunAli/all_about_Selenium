package Seleniums_Forever;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author jey
 * 
 * this non order base window popup concept 
 * it means we can handle here like list like from zero to up the point its maintaning all the windows with set object
 * 
 * main methods getwindowhandles, iterator, and .next 
 * 
 * in the next chapter i will have some code about order base window popUp Handling
 *
 */

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebElementUtil util;
		
		BrowserUtility b = new BrowserUtility();
		
		driver = b.init_driver("chrome");
		
		b.launchUrl("http://www.popuptest.com/goodpopups.html");
		
		util = new WebElementUtil(driver);
		
		By popUp_1 = By.linkText("Good PopUp #1");
		
		util.getElement(popUp_1).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWIndowId = it.next();
		System.out.println("parent window id: "+parentWIndowId);
		
		String childWIndowId = it.next();
		System.out.println("child window id: "+childWIndowId);
		
		
		driver.switchTo().window(childWIndowId);
		
		String popUrl = driver.getCurrentUrl();
		System.out.println("popUp url: "+popUrl);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWIndowId);
		String prenttitle = b.doGetTitle();
		System.out.println(prenttitle);
		
	}

}

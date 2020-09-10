package Seleniums_Forever;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowpopUp_2 {

	public static void main(String[] args) {

		
		WebDriver driver;
		WebElementUtil util;
		
		BrowserUtility b = new BrowserUtility();
		
		driver = b.init_driver("chrome");
		
		b.launchUrl("http://www.popuptest.com/goodpopups.html");
		
		util = new WebElementUtil(driver);
		
		By popUp_1 = By.linkText("Good PopUp #4");
		
		util.getElement(popUp_1).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List <String> handleList =  new ArrayList<String>(handles);
		
		//size is 2 because once it click the popUp another browserPoP will open and count becaoming 2 main and child browser
		/**
		 * this is also handling windowpop up with gethandlers method 
		 * but here im converting from set object to the list interface 
		 * and im maintaning my window popUp hanling by indexing 
		 * creating object of the String Type of the Arraylist by referreing List interface 
		 * and its call in java Top casting 
		 */
		
		System.out.println(handleList.size());  
		
		String ParentWindow = handleList.get(0);
		String ChildWindow = handleList.get(1);

		System.out.println("ParentWindow id: "+ ParentWindow);
		System.out.println("ChildWindow id: "+ ChildWindow);

		driver.switchTo().window(ChildWindow);
		
		System.out.println("popUp title is: "+b.doGetTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		System.out.println("Parent window title is: "+b.doGetTitle());
		
		
	}

}

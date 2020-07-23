package AlfaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindoBasedPopUp {
	
	/**
	 * 
	 * @param args
	 * browser windowpopUp with set object 
	 * 
	 *  window browser popups is usually happening in erp application 
	 *  for example you chlicking the button one window opening you have to fill ghe form
	 *  
	 *  how to know its window based popup 
	 *  so its having its own dom, title, url 
	 *  
	 *  pay close attention here 
	 *  every window have special unique dynamic window id we cannot inspect it
	 *  we can handle it with getwindowgandles method return type of this method is set of string 
	 *  here need to understand set is different from list 
	 *  set is not stroring the value on the basis of the idexing 
	 *  
	 *  so whenever im declaring handles method the object creating but this object is not mainten
	 *  the order by indexing it is maintane the order by parent id window and child id window 
	 *  
	 *  another thing  in set object we cannot store dublicate values but in list we can 
	 *  because of the indexless concept we cannot use for loop here to itearete the value 
	 *  so to solve this problem we have to use 
	 *  we we use iterator to handle windowpop we use next method also 
	 *  what it does 
	 *  so iterator is always above the windows 
	 *  we use next method to point exatly the window that we want to handle 
	 *  
	 *  another thing we cannot see 2 JS popup at the same time 
	 *  why because one js popup appear its disabling my actions on my main window 
	 *  i have to do something on alert 
	 *  
	 *  but in window based popup its possible to see 2 popup at the same time 
	 * 
	 * 
	 */
	
	
	

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
	
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwindoID = it.next();
		System.out.println(parentwindoID);
		
		
		String childwindoID = it.next();
		System.out.println(childwindoID);
		
		driver.switchTo().window(childwindoID);
		System.out.println("childnWindow Title is: " +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindoID);
		System.out.println("parent Window Title is: " +driver.getTitle());
		
		// driver.quit();
		
		
		
		

	}

}

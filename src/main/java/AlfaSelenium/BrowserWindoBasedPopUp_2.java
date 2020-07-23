package AlfaSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author jey
 * 
 * list base window based popup handling 
 * converting set to list object window popup handling 
 * for first getting getwindwohandles method giving referrnce name 
 * then creating object of the arraylist by list interface 
 * doing top casting then passing constructor of the gethandles method refernce name to the array 
 * list then starting switch 
 * using arraylist refering list interface 
 * 
 * here we can get window id by for loop and as well as with iterator 
 * but in set object we can get window id only by iterator 
 *
 *
 */
public class BrowserWindoBasedPopUp_2 {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		
		//here list is interface Arraylist is java class 
		//creating child class object by refering parent interface reference name 
		// example of the top casting 
		//here to array we are passing constructor handles
		
		// converting set to list 
		//arraylist maintain the order start from zero and so on 
		List<String> handleslist =new ArrayList<String>(handles);
		
		System.out.println(handleslist.size());
		
		String parentWindowID = handleslist.get(0);
		System.out.println(parentWindowID);
		
		String childWindowID = handleslist.get(1);
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());

		
		
		
		
		
		
	}

}

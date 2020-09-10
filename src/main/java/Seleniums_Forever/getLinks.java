package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getLinks {

	public static void main(String[] args) {

		
		/**
		 * note: 
		 * getting all the links with a tag printing all the links text
		 * if the any space or emtiness avoiding by isempty method then triming
		 * then getting all the href which is associated with links 
		 * 
		 */
		BrowserUtility bu = new BrowserUtility();
		
		WebDriver driver = bu.init_driver("chrome");
		bu.launchUrl("https://www.w3schools.com/java/default.asp");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		int linklistsize = linklist.size();
		System.out.println("total links: " +linklistsize);
		
		for(int i=0; i<linklist.size(); i++) {
			String text = linklist.get(i).getText();
			
			if(!text.isEmpty()) {
			System.out.println(i+"--->>"+text.trim());
			String href = linklist.get(i).getAttribute("href");
			System.out.println(href);
		}
		
		}
		
		bu.doQuitBrowser();
	}

}

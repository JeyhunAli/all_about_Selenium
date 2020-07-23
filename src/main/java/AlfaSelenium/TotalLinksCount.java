package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksCount {

	public static void main(String[] args) {

		/**
		 * how to get all the links from page 
		 * as we know all the links are assosiated with a tag 
		 * .findelements by tag name a 
		 * then getting size printing and getting text 
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.freshworks.com/");
		
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		System.out.println("total size of the links is: "+listOfLinks.size());
		
		for(int i = 0; i<listOfLinks.size(); i++) {
		String textlist = listOfLinks.get(i).getText();
			
		
		
		if(! textlist.isEmpty()) { // avoiding all the blanks between links 
			System.out.println(i + "---->> " +textlist.trim()); 
			System.out.println(listOfLinks.get(i).getAttribute("href"));
		}
			
			
		}
	}

}

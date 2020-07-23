package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author jey
 * 
 *there 3 way to handle frames by index by name by webelement 
 *the best way to handle it by name. index could be change in the future it could be dynamic
 *frame method is method overloaded 
 *
 *to find out how many frames in the page using locator tagname and .size to get count of it 
 *
 *one more conception sometimes right click is not working to check html dom 
 *so in that case press f12 on the keyboard then it will appear 
 */


public class FrameHandling {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().frame("main");
		
		
		WebElement element = driver.findElement(By.tagName("h2"));
		
		
		System.out.println(element.getText());
		
		if(element.equals(element)) {
			System.out.println("correct title");
		}
		else {
			System.out.println("wrong title");
		}
		
		driver.switchTo().defaultContent();
		
	int framecount = driver.findElements(By.tagName("frame")).size();
	System.out.println("total frame is: "+framecount);
	
	}

}

package AlfaSelenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			
			String text = linklist.get(i).getText();
			
			System.out.println(text);
			
			if(! text.isEmpty()) {
				System.out.println(i+ " --->>" + text.trim());
				
				System.out.println(linklist.get(i).getAttribute("href"));
				
			}
			
		}
		
		
		driver.quit();
		
		
		
	}

}

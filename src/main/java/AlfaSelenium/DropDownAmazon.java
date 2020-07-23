package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * dropdown without select class
 * find elements method forloop
 * if else condition then break 
 */

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAmazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		

		List<WebElement> listAll=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		
		for(int i=0; i<listAll.size(); i++) {
			String textAll=listAll.get(i).getText();
			
			System.out.println(textAll);
			
			if(textAll.equals("Toys & Games")) {
				
				listAll.get(i).click();
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

package Seleniums_Forever;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapUsage {
	static WebElementUtil e;

	public static void main(String[] args) {

		
		Map<String, String> m = monthhhh();
		System.out.println(m);
		
	}
	
	public static Map<String, String> monthhhh() {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://words-solver.com/list-all-the-months-in-order/");
		e = new WebElementUtil(driver);
		

		By coockie = By.xpath("//input[@value='Close and accept']");
		By month = By.cssSelector("div.wp-block-jetpack-markdown li");
		By link = By.cssSelector("li#menu-item-451 a");
		
		e.DoActionClick(coockie);
		  
		
	
		Map<String, String> monthList = new HashMap<String, String>();
		
		
		String linktext = monthList.put("link", e.getElement(link).getText().trim());
		System.out.println("linktext is ----->>> " +linktext);
		List<WebElement> listOfMonth = e.getElements(month);
		
		for(WebElement e: listOfMonth) {
			monthList.put(e.getText().split(" ")[0].trim(), e.getText().trim());
		       
		}
		
		 e.done();  
		return monthList;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

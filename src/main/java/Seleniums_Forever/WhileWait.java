package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhileWait {

	public static void main(String[] args) throws InterruptedException  {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/");
		
		WebElementUtil u = new WebElementUtil(driver);

		
		By element = By.xpath("(//div[@role='button'])[2]");
		By contact = By.xpath("//li[@id='menu-item-387']/a");
				
				//u.doClick(closeClick);
		//WebElement element = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
		//u.waitForURL(url, timeOut)
		String url1 = u.waitForURL("https://naveenautomationlabs.com/", 6);
		System.err.println("url is :" +url1);

		u.isElementDisplayed_ThenClick(element, 4);
		
		//u.isElementDisplayed(element, 3);
		u.waitForElementToBeClickable(contact, 3);
		//u.isElementDisplayed_ThenClick(contact, 2);
		
		u.doClick(contact);
		String url2 = u.waitForURL("https://naveenautomationlabs.com/contact-us/", 2);
System.err.println("url is :" +url2);
		
	}
	

}

package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		
		BrowserUtility browser = new BrowserUtility();
		
		WebDriver driver = browser.init_driver("chrome");
		
		browser.launchUrl("https://app.hubspot.com/login/");
		
		Thread.sleep(5000);
		
		String title = browser.doGetTitle();
		System.out.println(title);
		
		By emailid = By.id("username");
	    By pawword = By.id("password");
	    By login = By.id("loginBtn");
	    By header = By.xpath("//h1[@class='dashboard-selector__title']");
	    
	    WebElementUtil e = new WebElementUtil(driver);
	    
	    e.doSendkeys(emailid, "Ali-ceyhun@list.ru");
	    e.doSendkeys(pawword, "Hubspot8080");
	    e.doClick(login);
	    Thread.sleep(2000);
	    
	    
	    String head = e.doGetText(header);
	    
	    if(head.equalsIgnoreCase("Sales Dashboard")) {
	    	System.out.println("correct header");
	    }
	    else 
	    {
	    	System.out.println("wrong header");
	    }
	    
	    System.out.println(head);
	    
		browser.doQuitBrowser();
		
	}

}

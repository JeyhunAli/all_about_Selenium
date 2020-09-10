package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSvg {

	public static void main(String[] args) {

		WebDriver driver;
		WebElementUtil util;

		

		BrowserUtility bro = new BrowserUtility();
		
		driver = bro.init_driver("chrome");
		
		bro.launchUrl("https://www.google.com/");
		
		String text = bro.doGetTitle();
		
		System.out.println(text);
		
	    util = new WebElementUtil(driver);
	    
	    By searchVoice = By.xpath("//*[name()='svg']//*[local-name()='path' and @fill='#4285f4']");
	    
	    util.getElement(searchVoice).click();
		
	    
		
	}

}

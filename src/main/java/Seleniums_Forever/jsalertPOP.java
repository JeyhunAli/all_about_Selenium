package Seleniums_Forever;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jsalertPOP {

	public static void main(String[] args) {

		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.init_driver("chrome");
		bu.launchUrl("https://mail.rediff.com/cgi-bin/login.cgi"); 
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); // click ok button
		alert.dismiss(); // click on cancel button
	//	alert.sendKeys("send some keys");
		
		
		
		
		
		
		bu.doQuitBrowser();
	}

}

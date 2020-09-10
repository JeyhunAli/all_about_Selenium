package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F_bookdropdown {

	public static void main(String[] args) {

		WebElementUtil ele;
		
		BrowserUtility u = new BrowserUtility();
		WebDriver driver = u.init_driver("chrome");
		u.launchUrl("https://www.facebook.com/");
		
		By createAccount = By.id("u_0_2");
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		
		
		ele = new WebElementUtil(driver);
		
		ele.getElement(createAccount).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("some exception oocured while waiting ");
		}
		
		ele.doSelectByVisibleText(day, "1");
		ele.doSelectByVisibleText(month, "Feb");
		ele.doSelectByVisibleText(year, "1988");
		
		
		
	}

}

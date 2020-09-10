package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectWithSplit {

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
		
		String date = "23/Feb/1986";
		
		ele.getElement(createAccount).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("some exception oocured while waiting ");
		}
		
		ele.doSelectByVisibleText(day, date.split("/")[0]);
		ele.doSelectByVisibleText(month, date.split("/")[1]);
		ele.doSelectByVisibleText(year, date.split("/")[2]);
	}

}

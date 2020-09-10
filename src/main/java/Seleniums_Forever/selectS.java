package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectS {

	public static void doSelectByVisibleText(WebElement element, String Value) {

		Select select = new Select(element);
		select.selectByVisibleText(Value);

	}

	public static void doSelectByIndexText(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void doSelectbyValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}

	
	public static void main(String[] args) {

		BrowserUtility u = new BrowserUtility();

		WebDriver driver = u.init_driver("chrome");

		u.launchUrl("https://the-internet.herokuapp.com/dropdown");

		WebElement dr = driver.findElement(By.id("dropdown"));

	    doSelectByVisibleText(dr, "Option 1");
		// doSelectByIndexText(dr, 2);
		// doSelectbyValue(dr, "2");

		u.doQuitBrowser();

	}

}

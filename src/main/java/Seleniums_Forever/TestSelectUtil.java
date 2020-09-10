package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestSelectUtil {

	public static void main(String[] args) {

		WebElementUtil element;

		BrowserUtility u = new BrowserUtility();
		WebDriver driver = u.init_driver("safari");

		u.launchUrl("https://the-internet.herokuapp.com/dropdown");

		By dropdown = By.id("dropdown");

		element = new WebElementUtil(driver);

		element.getElement(dropdown);

		element.doSelectByVisibleText(dropdown, "Option 2");

	}

}

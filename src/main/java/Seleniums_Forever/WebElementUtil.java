package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtil {

	WebDriver driver;


	public  WebElementUtil (WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement (By locator) {

		WebElement element = driver.findElement(locator);
		return element;

	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);


	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator ) {
		return getElement(locator).getText();












	}


}

package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown_if_else {

	static WebElementUtil ele;

	public static void main(String[] args) {
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
			System.out.println("some exception occured while waiting");
		}

		doSelectDropDownValueWith_If_Else(driver, day, "16");
		doSelectDropDownValueWith_If_Else(driver, month, "Feb");
		doSelectDropDownValueWith_If_Else(driver, year, "1988");

	}

	public static void doSelectDropDownValueWith_If_Else(WebDriver driver, By locator, String value) {

		Select select = new Select(ele.getElement(locator));
		List<WebElement> optionslist = select.getOptions();

		System.out.println(optionslist.size());

		for (int i = 0; i < optionslist.size(); i++) {

			String options_text = optionslist.get(i).getText();

			System.out.println(options_text);

			if (options_text.equals(value)) {
				optionslist.get(i).click();
				break;

			}

		}

	}

}

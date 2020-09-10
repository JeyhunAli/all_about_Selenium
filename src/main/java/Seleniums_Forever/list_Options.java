package Seleniums_Forever;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class list_Options {

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

		ArrayList<String> dayslist = getDropDownOption(driver, day);
		System.out.println(dayslist.size());
		System.out.println(dayslist);

		ArrayList<String> monthlist = getDropDownOption(driver, month);
		System.out.println(monthlist.size());
		System.out.println(monthlist);

		ArrayList<String> yearlist = getDropDownOption(driver, year);
		System.out.println(yearlist.size());
		System.out.println(yearlist);

		ele = new WebElementUtil(driver);

		System.out.println("total count of day in facebook login page is: " + getDropDownOptionsCount(driver, day));
		System.out.println("total count of month in facebook login page is: " + getDropDownOptionsCount(driver, month));
		System.out.println("total count of year in facebook login page is: " + getDropDownOptionsCount(driver, year));

	}
	


	public static int getDropDownOptionsCount(WebDriver driver, By locator) {

		return getDropDownOption(driver, locator).size();

	}

	public static ArrayList<String> getDropDownOption(WebDriver driver, By locator) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("some exception occured while waiting");
		}

		ArrayList<String> ar = new ArrayList<String>();

		Select select = new Select(ele.getElement(locator));
		List<WebElement> options = select.getOptions();
		// System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			ar.add(text);
			// it will keep filling all the options into arraylist

			// System.out.println(text);

		}
		return ar;

	}

}

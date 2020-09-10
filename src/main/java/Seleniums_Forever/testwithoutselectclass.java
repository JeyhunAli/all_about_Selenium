package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testwithoutselectclass {

	static WebElementUtil ele;
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtility u = new BrowserUtility();
		driver = u.init_driver("chrome");
		u.launchUrl("https://www.facebook.com/");

		By createAccount = By.id("u_0_2");
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		By dayslist = By.xpath("//select[@id='day']/option");
		By monthlist = By.xpath("//select[@id='month']/option");
		By yearlist = By.xpath("//select[@id='year']/option");

		ele = new WebElementUtil(driver);

		String date = "16-Aug-1989";

		ele.getElement(createAccount).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("some exception occured while waiting");
		}

		ele.doSelect_Single_dropdownvalue_WithoutSelect(dayslist, "13");
		ele.doSelect_Single_dropdownvalue_WithoutSelect(monthlist, "Aug");
		ele.doSelect_Single_dropdownvalue_WithoutSelect(yearlist, "1909");

	}

}

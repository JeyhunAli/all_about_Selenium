package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jQuery {

	/**
	 * this is the first way of getting single and multiple value from drop down
	 * without using select class because there are no any select tag in the dom
	 * 
	 * but in second class im going to improve this code instead of calling same
	 * method name multiple time to get the values i will call the same method only
	 * once and i will get same time single value multiple value and all the value
	 
	 */
	static WebDriver driver;
	static WebElementUtil util;
	static By choice_set = By.xpath("//ul/li/span[@class='comboTreeItemTitle']");
	static By clickSelect = By.id("justAnInputBox");

	public static void main(String[] args) {

		BrowserUtility u = new BrowserUtility();
		driver = u.init_driver("chrome");
		u.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		util = new WebElementUtil(driver);

		util.getElement(clickSelect).click();

		getChoiceValuesByClicking(driver, "choice 2 2");
		getChoiceValuesByClicking(driver, "choice 6");
		getChoiceValuesByClicking(driver, "choice 3");

	}

	public static void getChoiceValuesByClicking(WebDriver driver, String values) {

		List<WebElement> choiceList = util.getElements(choice_set);

		System.out.println(choiceList.size());

		for (int i = 0; i < choiceList.size(); i++) {
			String textofchoice = choiceList.get(i).getText();
			System.out.println(textofchoice);

			if (textofchoice.equals(values)) {
				choiceList.get(i).click();
				break;
			}

		}

	}

}

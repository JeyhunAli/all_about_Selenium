package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author jey explaining of this code with multiple and all selection
 *
 *         multiple seclection tree dot here works as array once you created
 *         String... and values this already array once you declared like that
 *         you have to create one inner loop and pass values[y] here values name
 *         of the array y is the index of the inner for loop once you call your
 *         method <<<<<getChoiceValuesByClicking(driver, "choice 2 2", "choice
 *         6", "choice 3", "choice 5"); >>>> with the all given values it will
 *         store all these in array then it will click all the mentioned one
 *
 *
 *
 *         then anothe concept is to click all the values for that as value type
 *         "all"
 *
 *         onve you got the element right after that start your if condition
 *         with ! for exa <<<<<< if (!values[0].equalsIgnoreCase("All")) { >>>>>
 *
 *         here values[0] initiallly equal to 0 ! -->> means if values from 0 to
 *         all the values equal to all make it not false
 *
 *         then <<<<<<< for (int all = 0; all < choiceList.size(); all++) {
 *         >>>>>>>>>
 *
 *         this code means after if its not false then click all the values from
 *         dropdown
 * 
 */

public class jQuery3 {

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

		// get_All_ChoiceValues(driver, "choice 2 2");
		// single selection
		// get_All_ChoiceValues(driver, "choice 6");
		// single selection
		// get_All_ChoiceValues(driver, "choice 2 2", "choice 6", "choice 3",
		// "choice 5", "choice 1");
		// multi selection
		get_All_ChoiceValues(driver, "All");
		// All selection

	}

	public static void get_All_ChoiceValues(WebDriver driver, String... values) {

		List<WebElement> choicesetlist = util.getElements(choice_set);

		if (!values[0].equalsIgnoreCase("all")) {

			System.out.println(choicesetlist.size());

			for (int i = 0; i < choicesetlist.size(); i++) {
				String choice_text = choicesetlist.get(i).getText();
				System.out.println(choice_text);

				for (int y = 0; y < values.length; y++) {

					if (choice_text.equals(values[y])) {
						choicesetlist.get(y).click();
						break;
					}
				}

			}

		} else {
			try {
				for (int c = 0; c < choicesetlist.size(); c++) {
					choicesetlist.get(c).click();
				}
			} catch (Exception e) {

			}
		}

	}

}

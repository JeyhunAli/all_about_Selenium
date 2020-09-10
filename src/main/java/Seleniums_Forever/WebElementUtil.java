package Seleniums_Forever;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtil {

	WebDriver driver;

	public WebElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = null;
		try {
			System.out.println("locator is: " + locator);
			elements = driver.findElements(locator);
			System.out.println("WebElement created successfully: " + locator);
		} catch (Exception e) {
			System.out.println("some exception occured while creating list of webElements");
		}

		return elements;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;

		try {
			System.out.println("locator is: " + locator);
			element = driver.findElement(locator);
			System.out.println("WebElement created successfully: " + locator);
		} catch (Exception e) {
			System.out.println("some exception occured with this element: " + locator);
		}

		return element;

	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();

	}

	// ************************************<<<<<<<<<<<<<<<<<<Select, DropDown
	// utility>>>>>>>>>>>>>>>>>>***********************************

	public void doSelectByVisibleText(By locator, String Value) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(Value);

	}

	public void doSelectByIndexText(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectbyValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public int getDropDownOptionsCount(By locator) {
		return getDropDownOption(locator).size();

	}

	public ArrayList<String> getDropDownOption(By locator) {

		ArrayList<String> ar = new ArrayList<String>();

		Select select = new Select(getElement(locator));
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

	// applicapbe for single value select from dropdown
	public void doSelect_Single_DropDownValue(By locator, String value) {

		Select select = new Select(getElement(locator));
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

	// applicapbe for single value select from dropdown
	public void doSelect_Single_dropdownvalue_WithoutSelect(By locator, String value) {

		List<WebElement> listofoptions = getElements(locator);
		System.out.println(listofoptions.size());

		for (int i = 0; i < listofoptions.size(); i++) {
			String textofOptions = listofoptions.get(i).getText();
			System.out.println(textofOptions);
			if (textofOptions.equals(value)) {
				listofoptions.get(i).click();
				break;
			}

		}

	}

	// applicapbe for single,multiple,and all value select from dropdown
	public void get_All_ValuesFromDropDown(By locator, String... values) {

		List<WebElement> choicesetlist = getElements(locator);

		if (!values[0].equalsIgnoreCase("all")) {

			System.out.println(choicesetlist.size());

			for (int i = 0; i < choicesetlist.size(); i++) {
				String choice_text = choicesetlist.get(i).getText();
				System.out.println(choice_text);

				for (int y = 0; y < values.length; y++) {

					if (choice_text.equals(values[y])) {
						choicesetlist.get(i).click();
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

	// applicapbe for multiple value select from dropdown
	public void get_multiple_ValuesFromDropDown(By locator, String... values) {

		List<WebElement> choiceList = getElements(locator);

		System.out.println(choiceList.size());

		for (int i = 0; i < choiceList.size(); i++) {
			String textofchoice = choiceList.get(i).getText();
			System.out.println(textofchoice);

			for (int y = 0; y < values.length; y++) {
				if (textofchoice.equals(values[y])) {
					choiceList.get(i).click();
					break;
				}

			}

		}

	}
	// ************************************<<<<<<<<<<<<<<<<<<Actions
	// utility>>>>>>>>>>>>>>>>>>***********************************

	public void do_DragAndDrop(By source, By target) {
		Actions action = new Actions(driver);
		WebElement sourceElement = getElement(source);
		WebElement targetElement = getElement(target);
		action.dragAndDrop(sourceElement, targetElement).build().perform();

	}

	public void do_ClickAndHold_DragAndDrop(By sourceE, By targetE) {
		Actions action = new Actions(driver);
		WebElement source = getElement(sourceE);
		WebElement target = getElement(targetE);
		action.clickAndHold(source).moveToElement(target).release().perform();
	}

	public void DoActionSendKEys(By locator, String value) {

		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void DoActionClick(By locator) {

		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}

	public void domoveToElement(By locator) {

		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).build().perform();

	}

	public void doRightClickAction(By locator) {

		Actions action = new Actions(driver);
		action.contextClick(getElement(locator)).build().perform();
	}

	public void doClickAllCheckButton(By locator, String... values) {

		List<WebElement> checkBoxList = getElements(locator);

		if (!values[0].equalsIgnoreCase("all")) {
			System.out.println(checkBoxList.size());

			for (int i = 0; i < checkBoxList.size(); i++) {
				checkBoxList.get(i).click();
				// System.out.println(text);

				for (int y = 0; y < values.length; y++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					checkBoxList.get(i).click();
				}

			}

		}

		else {
			try {
				for (int c = 0; c < checkBoxList.size(); c++) {
					Thread.sleep(1000);

					checkBoxList.get(c).click();
				}
				System.out.println(checkBoxList.size());

			} catch (Exception e) {

			}
		}

	}

}

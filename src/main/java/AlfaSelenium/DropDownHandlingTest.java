package AlfaSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author jey
 * 
 * in dropdown concept if html tag is select then we are using select class from selenium  
 *theres no by default constructor for select class 
 *always we have to pass webelement as a parameter to the select class while creating object of the select
 *class
 *if we are using select class 
 */

public class DropDownHandlingTest {

	public static void main(String[] args) throws InterruptedException {


		ElementUtility element;
		WebDriver driver;



		WebDriverUtilityconsept webdriver = new WebDriverUtilityconsept();
		driver = webdriver.initializing_Driver("chrome");
		webdriver.launchingUrl("https://the-internet.herokuapp.com/");

		By dropdown = By.linkText("Dropdown");
		By dropdownlist = By.id("dropdown");

		Thread.sleep(3000);

		element = new ElementUtility(driver);

		element.getElement(dropdown).click();

		Thread.sleep(3000);

		element.doSelectByVisibleText(dropdownlist, "Option 2");

		webdriver.doQuitBrowser();





	}

}

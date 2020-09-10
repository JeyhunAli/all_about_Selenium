package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickandHoldActions {

	public static void main(String[] args) {
		
		
		
		WebElementUtil u;
		BrowserUtility bu;
		bu = new BrowserUtility();
		WebDriver driver = bu.init_driver("chrome");
		bu.launchUrl("https://jqueryui.com/resources/demos/droppable/default.html");
		u = new WebElementUtil(driver);

		By sourceele = By.id("draggable");
		By targetele = By.id("droppable");

		u.getElement(sourceele);
		u.getElement(targetele);

		u.do_ClickAndHold_DragAndDrop(sourceele, targetele);
	}


}

package Seleniums_Forever;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jQery4 {
	
	
	static WebDriver driver;
	static WebElementUtil util;
	
	static By clickSelect = By.id("justAnInputBox");
	
	static By choice_setscc = By.cssSelector("span.comboTreeItemTitle");

	public static void main(String[] args) {


		BrowserUtility u = new BrowserUtility();
		driver = u.init_driver("chrome");
		u.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		util = new WebElementUtil(driver);

		util.getElement(clickSelect).click();
		
		
		
		
		//util.get_All_ValuesFromDropDown(choice_setscc, "choice 1", "choice 2", "choice 2 1", "choice 2 2", "choice 2 3", "choice 3" );
		
		util.get_All_ValuesFromDropDown(choice_setscc, "all" );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		deselectvalue();
		
		
		
	}
	
	public static void deselectvalue() {
		
		//util = new WebElementUtil(driver);
		//util.get_multiple_ValuesFromDropDown(choice_setscc, "choice 1", "choice 2", "choice 2 1", "choice 2 2", "choice 2 3", "choice 3");
		
	//	util.get_All_ValuesFromDropDown(choice_setscc, "choice 1", "choice 2", "choice 2 1", "choice 2 2", "choice 2 3", "choice 3" );
		
		util.get_All_ValuesFromDropDown(choice_setscc, "all" );
		
		
	}
	
	
}


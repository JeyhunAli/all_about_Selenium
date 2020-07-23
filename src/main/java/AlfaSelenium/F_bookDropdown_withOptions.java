package AlfaSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_bookDropdown_withOptions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String date = "Feb/1/1988";

		By month = By.id("month");
		By day = By.id("day");
		By year = By.id("year");


		//		Select selectday = new Select(driver.findElement(day));
		//		
		//		List<WebElement> dayslist=selectday.getOptions();
		//		System.out.println(dayslist.size());
		//		
		//		for(int i=0; i<dayslist.size(); i++) {
		//			String daysText=dayslist.get(i).getText();
		//			System.out.println(daysText);
		//		}
		//		
		//		System.out.println("*******************************************************");
		//		
		//		
		//		Select selectmonth = new Select(driver.findElement(month));
		//		
		//		List<WebElement> monthslist=selectmonth.getOptions();
		//		System.out.println(dayslist.size());
		//		
		//		for(int i=0; i<monthslist.size(); i++) {
		//			String monthText=monthslist.get(i).getText();
		//			System.out.println(monthText);
		//		}
		//		
		//		
		//		System.out.println("*******************************************************");
		//		
		//		
		//		Select selectyear = new Select(driver.findElement(year));
		//		
		//		List<WebElement> yearslist=selectyear.getOptions();
		//		System.out.println(yearslist.size());
		//		
		//		for(int i=0; i<yearslist.size(); i++) {
		//			String yearsText=yearslist.get(i).getText();
		//			System.out.println(yearsText);
		//		}

		ArrayList<String>	monthlist = doGetDropDownOptions(driver, month);
		System.out.println(monthlist);
		ArrayList<String> dayslist = doGetDropDownOptions(driver, day);
		System.out.println(dayslist);
		ArrayList<String> yearslist = doGetDropDownOptions (driver, year);
		System.out.println(yearslist);
	}



	public static ArrayList<String> doGetDropDownOptions(WebDriver driver, By locator) {
		ArrayList<String> ar=new ArrayList<String>();
		Select selectoptions = new Select(driver.findElement(locator));

		List<WebElement> optionslist=selectoptions.getOptions();
		System.out.println(optionslist.size());

		for(int i=0; i<optionslist.size(); i++) {
			String optionslistText=optionslist.get(i).getText();
			ar.add(optionslistText);
			//System.out.println(optionslistText);
		}
		return ar;

	}



}






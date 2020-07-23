package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_bookDropdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String date = "Feb/1/1988";

		By month = By.id("month");
		By day = By.id("day");
		By year = By.id("year");


		ElementUtility ei=new ElementUtility(driver);

		//		ei.doSelectByVisibleText(day, "1");
		//		ei.doSelectByVisibleText(month, "Feb");
		//		ei.doSelectByVisibleText(year, "1988");


		//here taking value from string and spliting on the basis of 
		//given value storing in array then running 

		ei.doSelectByVisibleText(month, date.split("/")[0]);
		ei.doSelectByVisibleText(day, date.split("/")[1]);
		ei.doSelectByVisibleText(year, date.split("/")[2]);










	}

}

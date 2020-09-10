package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectwithoutselect {

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

		ele = new WebElementUtil(driver);

		String date = "16-Aug-1989";
		
		ele.getElement(createAccount).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("some exception occured while waiting");
		}

		
		
		doSelectdropdownvalue_WithoutSelect(driver, "//select[@id='day']/option", date.split("-")[0]);
		doSelectdropdownvalue_WithoutSelect(driver, "//select[@id='month']/option", date.split("-")[1]);
		doSelectdropdownvalue_WithoutSelect(driver, "//select[@id='year']/option", date.split("-")[2]);

		

	}
	
	 public static void doSelectdropdownvalue_WithoutSelect(WebDriver driver, String xPath, String value) {
		 
		 List<WebElement> listofoptions = driver.findElements(By.xpath(xPath));
			System.out.println(listofoptions.size());
			
			for(int i=0; i<listofoptions.size(); i++) {
				String textofOptions = listofoptions.get(i).getText();
				System.out.println(textofOptions);
				if(textofOptions.equals(value)) {
					listofoptions.get(i).click();
					break;
				}
				
			}
			
			
		 
	 }
	
	
	
	//
	
	
	
	
	
	
	
	
	
	

}

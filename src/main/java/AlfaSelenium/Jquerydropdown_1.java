package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown_1 {
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 * 
	 * this is dropdown handling without select class 
	 * here im talking about at the time to handle only one dropdown
	 * so what i mean by that 
	 * in dropdown menu theres multiple choises
	 * the code i wrote its able to click to dropdown and choose from dropdown only one 
	 * value 
	 * in order to choose multiple value i have to call generic method multiple times 
	 * in the next chapter i will apply to choose multiple value from dropdown at the same time 
	 * so stay tune
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(5000);
		
		WebElement inputdrop=driver.findElement(By.id("justAnInputBox"));
		inputdrop.click();
		
		
		SelectMultiplevalues(driver, "choice 1");
		SelectMultiplevalues(driver, "choice 2");
		SelectMultiplevalues(driver, "choice 2 3");
		SelectMultiplevalues(driver, "choice 7");
	}
	
	public static void SelectMultiplevalues(WebDriver driver, String values) {
	
	List<WebElement> listchoise = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	
	for(int i=0; i<listchoise.size(); i++) {
		String text = listchoise.get(i).getText();
		System.out.println(text);
		if(text.equals(values)) {
			listchoise.get(i).click();
			break;
		}
	}
}
	
	
	
}
	
	
	
	














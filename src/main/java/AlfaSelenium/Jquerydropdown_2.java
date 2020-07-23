package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown_2 {
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 * 
	 * in this chapter im writing generic code to select single value, multiple value, and as well as
	 * all the values from drop down 
	 * using inner loop, outor loop, three dot concept, array, 
	 * at the end breaking the loop 
	 * this generic method is available for all the dropdwons
	 * using no select class 
	 * no inbuilt method 
	 * 
	 * these methods im wrting code concerns only selecting single choice and multiple choice 
	 * in the next chapter i will add some more flavors to this methods it will select all the choices 
	 * along with these choices 
	 * 
	 * stay tuned
	 */

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(5000);
		
		WebElement inputdrop=driver.findElement(By.id("justAnInputBox"));
		inputdrop.click();
		
		//passing multiple choices at the time not separetly with help of the array three dot
		//and using here outtor loop inner loop 
		
		
		selectMultiplevaluesFromDropdwonwithoutSelect(driver, "choice 1", "choice 2", "choice 2 3", "choice 7");
		
		// single value selection
		//selectMultiplevaluesFromDropdwonwithoutSelect(driver, "choice 6 2 2");
		
		}

	public static void selectMultiplevaluesFromDropdwonwithoutSelect(WebDriver driver, String... values ) {
		
		List<WebElement>  listChoise=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		for(int i=0; i<listChoise.size(); i++) {
			String text=listChoise.get(i).getText();
			System.out.println(text);
			
			//here im passing name of the array values
			for(int l=0; l<values.length; l++) {
				
				//here passing array reference 
				if(text.equals(values[l])) {
					listChoise.get(i).click();
					break;
					
				}
			}
			
		}
		
	}
	
}

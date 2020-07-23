package AlfaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown_3 {

	public static void main(String[] args) throws InterruptedException {




		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(5000);

		WebElement inputdrop=driver.findElement(By.id("justAnInputBox"));
		inputdrop.click();

		selectMultiplevaluesFromDropdwonwithoutSelect(driver, "choice 1", "choice 2", "choice 2 3", "choice 7");

		//selectMultiplevaluesFromDropdwonwithoutSelect(driver, "choice 6 2 2");

		//selectMultiplevaluesFromDropdwonwithoutSelect(driver, "all");

		/**
		 * pay very close attention here 
		 * all as a string initally is zero and its given to 
		 * string value and index of the value is zero 
		 * why im declaring like that lets say im passing as a select only one choice 
		 * then it will come to (if portion if its value is single not equal to all the explanation mark there 
		 * will make it false then it will jump to for(portion and it will execute  
		 * but if im passing as aparam all then it will come to forst if portion it will define that its equal
		 * to all and explanation mark will not make it false then it will jump
		 * else portion and will select all the check box from dropdown 
		 * 
		 * 
		 * but this code will return some exception
		 * 
		 * Exception in thread "main" org.openqa.selenium.ElementNotInteractableException:
		 *  element not interactable
		 *  
		 *  this because whiile creating css locator for this dropdwon we got 45 element 
		 *  but out of 45 we are seelcting 16 elements 
		 *  to solve this problem im gonna use try catch block 
		 *  
		 *  
		 *  so this code will support single selection multiple selection and all the selection 
		 *  

		 */

	}

	public static void selectMultiplevaluesFromDropdwonwithoutSelect(WebDriver driver, String... values ) {

		List<WebElement>  listChoise=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		// declaration is above 
		if(! values[0].equalsIgnoreCase("All")) {



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

		else {
			try {
				for(int all=0; all<listChoise.size(); all++) {
					listChoise.get(all).click();
				}
			}
			catch (Exception e) {

			}

		}
	}

}


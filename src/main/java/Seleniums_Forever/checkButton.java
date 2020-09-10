package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");

		Thread.sleep(3000);

		//By checkBox = By.xpath("//input[contains(@type, 'checkbox')]");
		
		//WebElementUtil e = new WebElementUtil(driver);
		// driver.findElements(By.xpath("//input[contains(@type, 'checkbox')]"));

		doClickAllCheckButton(driver, "all");
		
	}
	
	public static void doClickAllCheckButton(WebDriver driver, String... values) throws InterruptedException {

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div/input[@type='checkbox']"));
		
		if (!values[0].equalsIgnoreCase("all")) {
		System.out.println(checkBoxList.size());
		
		for(int i=0; i<checkBoxList.size(); i++) {
	     checkBoxList.get(i).click();
			//System.out.println(text);
			
		
		
		for (int y = 0; y < values.length; y++) {

			Thread.sleep(1000);
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

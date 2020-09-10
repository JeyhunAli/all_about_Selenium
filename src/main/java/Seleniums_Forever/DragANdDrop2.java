package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragANdDrop2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElementUtil u = new WebElementUtil(driver);

		Thread.sleep(2000);
		
		
		By drag = By.id("draggable");
		By drop = By.id("droppable");
		
		u.do_ClickAndHold_DragAndDrop(drag, drop);
	}

}

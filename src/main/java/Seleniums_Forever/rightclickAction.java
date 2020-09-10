package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclickAction {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		//WebElementUtil u = new WebElementUtil(driver);

		
	//	By rightclick = By.xpath("//span[contains(text(),'right click me')]");
		
		
	//	u.getElement(rightclick);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		List<WebElement> rightclickBox = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]"));
		
		
	   Actions action = new Actions(driver);
	   
	   action.contextClick(rightclick).build().perform();
	   
		Thread.sleep(2000);

	   
	  int sizeofbox =  rightclickBox.size();
	  System.out.println( "size of count: "+sizeofbox);
	   
	   for(int i=0; i<rightclickBox.size(); i++) {
		   
		   String text = rightclickBox.get(i).getText();
		   System.out.println(text);
		   if(text.equals("Delete")) {
			   rightclickBox.get(i).click();
			   
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}

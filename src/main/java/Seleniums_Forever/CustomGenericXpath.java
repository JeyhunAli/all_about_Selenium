package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomGenericXpath {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		driver.findElement(By.id("username")).sendKeys("Ali-ceyhun@list.ru");
		driver.findElement(By.id("password")).sendKeys("Hubspot123456789");
		driver.findElement(By.xpath("//i18n-string[text()='Log in']")).click();
		
		
		Thread.sleep(1000);

		
		driver.navigate().to("https://app.hubspot.com/contacts/6566020/contacts/list/view/all/");
		
		
		
	}

}

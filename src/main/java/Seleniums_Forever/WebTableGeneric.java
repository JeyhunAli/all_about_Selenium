package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableGeneric {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(6000);
		driver.navigate().to("https://app.hubspot.com/contacts/6329229/contacts/list/view/all/");
		Thread.sleep(6000);

//		driver.findElement(By.xpath("//span[text()='Naveen Khunteta']"
//				+ "//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__indicator']")).click();
		//span[text()='tom peter']//ancestor::td//following-sibling::td/a
		//selectContact(driver, "Naveen Khunteta");
		selectContact(driver, "tom peter");
		System.out.println(getContactEmailId(driver, "tom peter"));
		
		//tr[3]//td[1]//div[1]//label[1]//span[1]//span[1]//span[2]//*[local-name()='svg']

	}
	
	public static void selectContact(WebDriver driver, String contactName){
		driver.findElement(By.xpath("//span[text()='"+contactName+"']"
				+ "//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__indicator']")).click();
	}
	
	public static String getContactEmailId(WebDriver driver, String contactName){
		return driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//following-sibling::td/a")).getText();
	}

}


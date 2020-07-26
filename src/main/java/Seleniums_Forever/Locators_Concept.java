package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Concept {

	public static void main(String[] args) throws InterruptedException {

		//create the webelement --> perform actions (click, sendkeys, get the text)
		//locators -- 8 diff types of locators in Selenium in By class
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://www.freshworks.com/");
		
		Thread.sleep(5000);
		
		//Web Elemenets + ACTIONS
		//1. id: unique --I
		
		/**
		 * 
		 * there're 4 different ways to create web elements they are shown below 
		 * my personla approach is with by class 
		 * 
		 * 
		 * in some application right click and open developer tool is not available 
		 * for that u can use press function f12 button 
		 * or view-->>developer-->>developer tool
		 * 
		 * 
		 */ 
		
		
		//Case 1:
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//Case 2:
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
//		loginButton.click();
			
		//Case 3: by locators:
//		By email = By.id("username");
//		By password = By.id("password");
//		By loginButton = By.id("loginBtn");
//
//		//webelements:
//		WebElement emailid = driver.findElement(email);
//		emailid.sendKeys("test@gmail.com");
		
		//Case 4: String locators:
//		String emailId = "username";
//		String password = "password";
//		String loginButton = "loginBtn";
//		
//		By email1 = By.id(emailId);
//		By password1 = By.id(password);
//		By loginButton1 = By.id(loginButton);
//		
//		driver.findElement(email1).sendKeys("test@gmail.com");
		
		//2. name: is not unique -  II
		//driver.findElement(By.name("username")).sendKeys("test");
		
		
		//3. className: -- if its unique -- III
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test@123");

		 //4. xpath: -IV-- is the address of the element in HTML DOM but its not an attribute
		/**
		 * XML Path Language
          XPath stands for XML Path Language. It uses a non-XML syntax to provide a flexible 
          way of addressing (pointing to) different parts of an XML document. 
          It can also be used to test addressed nodes within a document to 
          determine whether they match a pattern or not.
		 */
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
		
		//5. cssSelector: IV-- is not the attribute
		//driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//6. linkText: only for links  
		/**
		 * linktext associated with a tag
		 * and sometimes a tag can be parent also 
		 * 
		 * hypertext reference
            href---->>>stands for hypertext reference. 
            It's the source of the file used by the tag. 
            You can use both not only when connecting an external css file,
             also for using <a> tags,for a regular hyperlink.
		 */
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial Link Text: only for links
		//driver.findElement(By.partialLinkText("Sign")).click();
		//Sign up
		//Sign in
		
		//8. tagName: --V 
		/**
		 * tag  name not all the time is usefull because tag name can be multiple tags with same tags 
		 * but sometimes in some web pages header is with html tag name can be found
		 */
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
		String linkText = driver.findElement(By.linkText("Platform")).getText();
		System.out.println(linkText);

	}

}
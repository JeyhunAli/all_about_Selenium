package Seleniums_Forever;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quit_Close {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "your driver path here ");
		
		/**
		 * differences between quit and close 
		 * 1. after wrting your code debug it then it will give you session id 
		 *  ChromeDriver: chrome on MAC (ecf069faa3217c564fa582b4eb41082c)  ----->>> this is the session id 
		 *  this session id will be in every step in this class until we will quit our browser 
		 *  once we quit the job session id will over 
		 *  if you want to verify it right after quit method just write this line driver.get title 
		 *  and write it again then you will get   nosuchsessionexception 
		 *  
		 *  
		 *  
		 *  but with the close statement after closing the browser we are getting same exception  nosuchsessionexception 
		 *  but session id is there even after closing the browser it shows the 
		 *  browser id same one but its expired 
		 *  its not null as quit method in quit method it says null id 
		 *  but with close it says invalid id means its already expired 
		 *  
		 *  
		 *  somebody can ask silly question so how i can solve this issue 
		 *  its simple just create again object of any browser then it will give you new session id 
		 *  
		 *  there's another difference as well but it belong to window pop up 
		 *  i will add that difference later stay tuned )))
		 *  
		 * 
		 */
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//launch browser
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		//driver.quit();   //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();     // org.openqa.selenium.NoSuchSessionException: invalid session id
		
		//driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		
		
	}

}

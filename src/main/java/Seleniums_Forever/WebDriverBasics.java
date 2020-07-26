package Seleniums_Forever;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WebDriverBasics {
		
		static String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		public static void main(String[] args) throws InterruptedException {

			
			/**
			 * 
			 * while debugging the code after each and every line once you press the f6 button mouse over the previous 
			 * condition to see either its macth with your code or not 
			 * 
			 * another tip with debugging lets say you are checking if the title is matching with your code or not 
			 * once you press the f6 after title code executed copy the title code for example <<< actualTitle.equals(expectedTitle>>
			 * then right click on it then click on watch it will show you the result set
			 */
			
			//Windows:
			//System.setProperty("webdriver.chrome.driver", "c:\\users\\downloads\\chromedriverversion\\chromedriver.exe");
			
			//MAC
			System.setProperty("webdriver.chrome.driver", "path of the driver");
			WebDriver driver = new ChromeDriver();//launch browser
			
			driver.get("http://www.amazon.com");//enter url 
			//url will work only if there http:  without that it will thrown error 
			//but without www its working but better practice to have www
			
			String actualTitle = driver.getTitle();//get the page title
			System.out.println("page title is: " + actualTitle);
			
			//verification point: checkpoint: expected vs actual result : Assertions
			if(actualTitle.equals(expectedTitle)){
				System.out.println("correct title");
			}
			else{
				System.out.println("incorrect title");
			}
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if(url.contains("amazon")){
				System.out.println("correct url");
			}
			
			//System.out.println(driver.getPageSource());
			
			Thread.sleep(3000);
			driver.quit();//close the browser
			
			/**
			 * 
			 *  next class im gonna deep talking about differences between quit and close 
			 */
			
			
			
		}

	}



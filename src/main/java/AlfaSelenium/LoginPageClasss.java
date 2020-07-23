package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageClasss {

	/**
	 * 	to reach the login page i have to launch  the browser for that i browser 
	 * 	and my browser is in WebDriverUtilityconsept class 
	 * @param args
	 * @throws InterruptedException 
	 */


	public static void main(String[] args) throws InterruptedException {

		WebDriverUtilityconsept webutil = new WebDriverUtilityconsept();
		WebDriver driver = webutil.initializing_Driver("chrome");
		webutil.launchingUrl("https://app.hubspot.com/login");

		Thread.sleep(5000);

		String currentUrl = webutil.doGetCurrentUrl();
		System.out.println(currentUrl);

		String title =  webutil.doGetTitleOfPage();
		System.out.println(title);

		//creating By locator to access elements 
		By emailadress = By.id("username");
		By password = By.id("password");
		By loginbutton = By.id("loginBtn");
		By headerloginpage = By.cssSelector("h1.private-page__title");

		//creating object of the ElementUtility class to access al the utility methods 
		// and passing driver as param so easily can initialize 
		ElementUtility element = new ElementUtility(driver);
		element.doSendKeys(emailadress, "Ali-ceyhun@list.ru");
		element.doSendKeys(password, "Asderfgty5758");

		if(	element.doIsDisplayed(loginbutton)) {
			System.out.println("is displayed method displayed : "+loginbutton);
			element.doClick(loginbutton);
		}
		Thread.sleep(50000);

		String header = element.dogetText(headerloginpage);
		System.out.println(header);

		if(header.equals(header)) {
			System.out.println("exact header is: "+ header );

		}else 
		{
			System.out.println("wrong header");
		}


		webutil.doQuitBrowser();

		


	}





}

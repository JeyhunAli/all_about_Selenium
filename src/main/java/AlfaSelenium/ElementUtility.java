package AlfaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtility {

	WebDriver driver;
	/**
	 * 
	 * 
	 * @param driver
	 * 
	 * here im creating constructor of the class why because constructor will hold driver
	 * which inside of this element utill class i dont need to call and launch the brawser once again 
	 * its inside of the constructor and whenever i will call 
	 * elementutility class driver will launch automatically 
	 * 
	 * 
	 * interview question how you handle exception in java practical answer is below 
	 * 
	 * first off all my im declaring driver.findelemet only once and its in my element utulity class 
	 * as we know that try catch block for exception handling for that while creating my generic method for 
	 * driver.find element method im surronding method with try catch block
	 * while surronding with try catch block first initially im declaring element as null 
	 * because if some exception is occured then it will creat nothing because initial element is null and it will print exception 
	 * message 
	 * but let say it successful then its not coming to catch block right away it will create the element 
	 * 
	 * 
	 */
	public ElementUtility(WebDriver driver) {
		this.driver=driver;
	}
	//creating web element generic method 
	//with try catch block 
	// just in case if any exception accured through all the element along the projectts 
	//it will go through from this method 
	//so it will catch any exception
	//in order to get element what i need locator concept so for that im passing loactor as param


	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			System.out.println("Locator is: "+locator);
			element = driver.findElement(locator);
			System.out.println("Webelement is created successfully :"+ locator);


		}	catch (Exception e) {

			System.out.println("Some exception occured while creating element with this locator "+ locator);
		}


		return element;

	}



	//here in order to pass my value what i need locator and element so for that im method chaning 
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}
	//here also in order to click the locator i need element so im method chaning here as well 
	public void doClick (By locator) {
		getElement(locator).click();

	}
	public String dogetText (By locator) {
		return getElement(locator).getText();	

	}

	public boolean doIsDisplayed (By locator) {
		return getElement(locator).isDisplayed();

	}


	/**
	 * select class in java is used to handle with dropdown 
	 * select class is valid whne in dom there s select html tag available then only select class we can use 
	 * select class is require web element as well 
	 * whenever we are creating select class object we have to pass as a param web element reference 
	 * most used methods on select class is 
	 * select by visible text
	 * select by index
	 * select by value 
	 * 
	 * 
	 * 
	 * here im creating generic select class for that what i need first locator and string value ro choose any 
	 * of them from dropdown
	 * 
	 * then creating object of select class passing getelement generic method with locator which is 
	 * i created earlier in order to get exact webelement
	 * then passing the value of dropdown
	 * 
	 */
	public void doSelectByVisibleText (By locator, String value) {
		Select select = new Select(getElement(locator));
		//here as a param im passing getelement method so it will give me element with all the properties 
		select.selectByVisibleText(value);
	}

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		//here as a param im passing getelement method so it will give me element with all the properties 

		select.selectByIndex(index);
	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		//here as a param im passing getelement method so it will give me element with all the properties 

		select.selectByValue(value);
	}















}

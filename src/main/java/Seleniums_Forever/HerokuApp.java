package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConstantUtil.ConstantUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuApp {

	public static WebDriver driver;
	private static WebElementUtil util;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new WebElementUtil(driver);
		driver.get(ConstantUtility.UrL);
		String title = driver.getTitle();
		if (title.contains(ConstantUtility.title)) {
			System.out.println("correct title is: " + title);
		} else {
			System.out.println("please pass correct title..... " + title);

		}

		By dynamicLoad = By.linkText("Dynamic Loading");
		By exampleElement = By.linkText("Example 1: Element on page that is hidden");
		By startButton = By.xpath("//div[@id='start']/button");
		By helloworldText = By.xpath("//h4[contains(text(), 'Hello World!')]");

		util.DoActionClick(dynamicLoad);
		util.doClick(exampleElement);
		util.doClick(startButton);
		System.err.println("url is: "+ driver.getCurrentUrl());
		
		util.waitFor_Text_Present(helloworldText, "Hello World!", 10);
		System.out.println("hidden text is: "+driver.findElement(helloworldText).getText());
		
	
		
		
		
		
		
		
	}

}

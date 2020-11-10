package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jquery.jqueryGrowlUtil;

public class AmazonDropDown {

	static WebDriver driver;
	static jqueryGrowlUtil jutil;
	static WebElementUtil eleUtil;

	@Test
	public void amazonTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		eleUtil = new WebElementUtil(driver);
		jutil = new jqueryGrowlUtil();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		
		eleUtil.waitFor_Full_TitleToBePresent(title, 6);
		System.out.println(title);

		//jutil.getRuntimeinfo("info", "title correct");

		driver.manage().deleteAllCookies();
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Macbook");
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='suggestions']/div"));
		System.out.println(list.size());
		
		
		for (WebElement e : list) {
			System.out.println(e.getText());
		}

	}

}

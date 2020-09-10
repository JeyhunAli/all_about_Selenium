package Seleniums_Forever;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		
		Thread.sleep(6000);
		
		WebElementUtil util = new WebElementUtil(driver);

		By login = By.xpath("//li/a[contains(text(), 'Login / Signup')]");
		By spiceClub = By.xpath("//a[contains(text(),'SpiceClub Members')]");
		By memeberlogin = By.xpath("(//li/a[contains(text(), 'Member Login')])[1]");

		util.domoveToElement(login);
		util.domoveToElement(spiceClub);
		util.doClick(memeberlogin);
		
		
	}

}

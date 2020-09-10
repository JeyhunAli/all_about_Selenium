package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class svgYouTube {

	public static void main(String[] args) {

		WebDriver driver;
		WebElementUtil util;

		BrowserUtility b = new BrowserUtility();

		driver = b.init_driver("chrome");
		b.launchUrl("https://www.youtube.com/");
		
		util = new WebElementUtil(driver);
		
		By svg = By.xpath("//*[name()='svg']");
		
		List<WebElement> listSvg = util.getElements(svg);	
		System.out.println(listSvg.size());
		
		for(int i=0; i<listSvg.size(); i++) {
		String text = listSvg.get(i).getText();
		System.out.println(text);
		
			
			
		}

	}


}
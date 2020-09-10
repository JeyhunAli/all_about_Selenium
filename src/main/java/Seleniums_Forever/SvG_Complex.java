package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author jey
 * 
 * Scalable Vector Graphics (SVG) is an Extensible Markup Language 
 * (XML)-based vector image format for two-dimensional graphics with 
 * support for interactivity and animation. The SVG specification 
 * is an open standard developed by the World Wide Web Consortium (W3C) since 1999.
 * 
 * 
 *   xpath for this is completely different it starts 
 *   
 *   //*[name()='svg']//*[local-name()='tagname']  and then your own custom xpath 
 *
 */

public class SvG_Complex {

	public static void main(String[] args) {

		WebDriver driver;
		WebElementUtil util;

		BrowserUtility b = new BrowserUtility();

		driver = b.init_driver("chrome");
		b.launchUrl("http://debeissat.nicolas.free.fr/");
		
		util = new WebElementUtil(driver);
		
		//driver.switchTo().frame("svg_result");
		
		while(true) {
		
		By dynamicSVG = By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']"
				+ "//*[local-name()='path' and contains(@id,face)]");
		
		List<WebElement> listOfSvg = util.getElements(dynamicSVG);
		
		System.out.println(listOfSvg.size());
		
		for(int i=0; i<listOfSvg.size(); i++) {
			
			String attributeText = listOfSvg.get(i).getAttribute("d");
			System.out.println(attributeText);
			
			
		}
		}	
		
	}

}

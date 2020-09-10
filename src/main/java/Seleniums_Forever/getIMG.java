package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getIMG {

	public static void main(String[] args) {

		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.init_driver("chrome");
		bu.launchUrl("https://www.w3schools.com/java/default.asp");

		List<WebElement> listOfImg = driver.findElements(By.tagName("img"));

		int sizeimg = listOfImg.size();
		System.out.println(sizeimg);

		for (int i = 0; i < listOfImg.size(); i++) {
			String textimg = listOfImg.get(i).getText();
			System.out.println(textimg);

			if (!textimg.isEmpty()) {
				System.out.println(listOfImg.get(i).getText().trim());
			}
			String src = listOfImg.get(i).getAttribute("src");
			System.out.println(src);

		}

		bu.doQuitBrowser();

	}

}

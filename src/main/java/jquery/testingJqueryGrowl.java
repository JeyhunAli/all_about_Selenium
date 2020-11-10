package jquery;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniums_Forever.WebElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testingJqueryGrowl {

	static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeMethod
	public void titletest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://freecrm.com/");

	}

	@Test
	public void freescrmTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		getRuntimeinfo("info", title);

		if (title.equals("#1 Free CRM customer relationship management software cloudd")) {
			Assert.assertTrue(true);
			getRuntimeinfo("info", "title is correct");

		} else {
			getRuntimeinfo("error", "BUG BUG BUG ");
			takeScreenShot2("freescrm");
			Assert.assertTrue(false);
		}

	}

	public void getRuntimeinfo(String messageType, String message) {

		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		// js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");

		// jquery-growl w/ colorized output
		if (messageType.equals("error")) {
			js.executeScript("$.growl.error({ title: 'ERROR', message: '" + message + "' });");

		} else if (messageType.equals("info")) {
			js.executeScript("$.growl.notice({ title: 'Notice', message: '" + message + "' });");

		} else if (messageType.equals("warning")) {
			js.executeScript("$.growl.warning({ title: 'Warning!', message: '" + message + "' });");

		}

	}

//	public String takeScreenShot() {
//		
//	
//	File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	String projectPath = System.getProperty("user.dir") + "/screenShot/" + System.currentTimeMillis()+ ".png";
//	File destination = new File(projectPath);
//	
//	try {
//		FileUtils.copyDirectory(scr, destination);
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	
//	return projectPath;
//	}

	public void takeScreenShot2(String fileName) {
		File filescr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(filescr,
					new File("/Users/jey/eclipse-workspace/all_about_Selenium/screenShot/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

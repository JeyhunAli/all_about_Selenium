package Seleniums_Forever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//Custom CSS:
		//id --> #id or htmltag#id
		//class --> .classname or htmltag.classname
		
		// #username
		// input#username
		
		//form-control private-form__control login-email
		
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// .c1.c2.c3...cn
		//.c1
		// .login-email
		// input.login-email       by class name 
		// input.login-email#username      by class name and id
		// input#username.login-email        
		// input.form-control.private-form__control.login-email#username     different classes have to have . between and together with id
		
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen");
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("naveen");
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("naveen");
		
		//htmltag[@prop='value']    with the @  and double slash // is xpath 
		// htmltag[prop='value']     without css 
		
		//input[@id='username']        with the @  and double slash // is xpath 
		// input[id='username']           without css 
				
		//input[@id='username' and @type='email']   ----->      // @ and  all this use in xpath 
		// input[id='username'][type='email']       ----->         none of them use in css 
		// input[id='username'][type='email'][tabindex='1']       multiple prop 
		// input[id][type][tabindex]
		// input[type='email']
		
		
		// div.private-form__input-wrapper > input#username     > use for finding child prop
		// div > input#username  
		// div input#username         same thing from div to child but not using >  just space 
		
		// ul.nav.navbar-nav.navbar-right li a          from ul finding class with the space li another space links
		// ul.nav.navbar-nav.navbar-right > li > a       same thing but with > 
		
		// ul.footer-nav li
		
		// input[id*= 'user'] -- contains          
		// input[id^= 'user'] -- starts with 
		// input[id$= 'name'] -- ends with
		
		
		//comma in css:
		// input#username, input#password, button#loginBtn  its used to get combination of elements that u want 
		//then store it and get size or loop 
		List<WebElement> list = driver.findElements(By.cssSelector("input.login-email, input#password, button#loginBtn"));
		System.out.println(list.size());
		if(list.size() == 3){
			System.out.println("my login form is displayed with all the elements....");
		}
		
		//nth-of-type:
		//this concept is used to wrap the css and get the desired one
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(1)  -- 1st element  
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(n) -- all elements
		 
		// ul li:nth-of-type(10)
		
		//following sibling in css: with + 
		// div.private-form__input-wrapper + div
		
		//not operator in CSS:
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(.login-password)
		// input.form-control.private-form__control:not(#username)
		
		
	}

}
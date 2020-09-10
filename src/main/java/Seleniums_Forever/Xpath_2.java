package Seleniums_Forever;

public class Xpath_2 {

	public static void main(String[] args) {

		// (//ul[@class='footer-nav'])[last()]
		// (//ul[@class='nav navbar-nav navbar-right']/li)[last()]
		// (//input[@type='text'])[last()]
		
		//div[@class='input-group']/input
		
		//div[@class='input-group']//following::input
		
		// (//div[@class='input-group']//following::input)[last()]
		
		 //input[@name='username']//preceding::div
		//input[@name='username']//following::div 
		
		//input[@name='username']//parent::div//parent::form//input[@name='password']
		
		//input[@name='username']/../../../../../../..  go to my parent 
		//div[@class='input-group']//ancestor::div  go to my grandparent div 
		//input[@name='username']//ancestor::div
		
		//a[text()='Cobby Hill']//parent::td//preceding-sibling::td/input
		//a[text()='Devid John']//parent::td//preceding-sibling::td/input
		
		//a[text()='Devid John']//parent::td//following-sibling::td/a[@context='company']
		// (//a[text()='Archana Rana']//parent::td//following-sibling::td/a[@context='company'])[last()-1]
		
	}

}
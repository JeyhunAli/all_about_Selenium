package Seleniums_Forever;

public class basicAuth {

	public static void main(String[] args) {
		
		
		/**
		 * this basic authentication popup 
		 * just need to pass credentials along the url
		 */

		BrowserUtility t = new BrowserUtility();
		
		t.init_driver("chrome");
		
		t.launchUrl("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
		
		t.doQuitBrowser();
	}

}

package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	@Test
	public void loginTest(){
		System.out.println("loginTest....");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest", priority=2)
	public void homePageTest(){
		System.out.println("homePageTest....");

	}
	
	@Test(dependsOnMethods = "loginTest", priority=1)
	public void searchPageTest(){
		System.out.println("searchPageTest....");
	}
	
	
	
	

}
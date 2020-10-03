package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divTest(){
		int a = 9/0;	
	}
	
	
	
	
	

}
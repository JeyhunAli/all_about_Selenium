package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	//@Test(expectedExceptions = Exception.class)
	//@Test(expectedExceptions = Throwable.class)
	
	//super class of exception error 

	/**
	 * this line code is throwing error because 9/0 is couse ArithmeticException in jva but with this 
	 * expectedExceptions concept its not trowing error 
	 * its executing but 
	 * after this code lets say there are hundreds of code they wont execute 
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void divTest(){
		int a = 9/0;	
		
		
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");
		System.out.println("great America");

	//these print statements wont execute here 
		
	
	
	}
	
	
	
	
	
	
	

}
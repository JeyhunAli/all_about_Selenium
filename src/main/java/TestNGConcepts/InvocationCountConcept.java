package TestNGConcepts;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	//GENERALLY we dont use this concept in selenium its used in Api testing 
	
	@Test(invocationCount = 10)
	public void googleTest(){
		System.out.println("google test");
	}
	
	
	

}
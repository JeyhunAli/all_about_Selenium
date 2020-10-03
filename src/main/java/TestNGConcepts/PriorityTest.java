package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test(priority=1)
	public void test1(){
		System.out.println("test 1...");
	}
	
	@Test(priority=2)
	public void test2(){
		System.out.println("test 2...");
	}
	
	@Test()
	public void btest3(){
		System.out.println("test 3...");
	}
	
	@Test()
	public void ctest4(){
		System.out.println("test 4...");
	}
	
	@Test()
	public void atest5(){
		System.out.println("test 5...");
	}
	
	

}
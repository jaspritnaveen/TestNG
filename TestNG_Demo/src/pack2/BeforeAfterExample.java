package pack2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterExample {
	
	
	@BeforeMethod
	
	public void testcase1() {
		System.out.println("Demo Test case 1 -----> 2");
		
	}

	@AfterMethod
	public void testcase2() {
		System.out.println("Demo Test case 2 --------> 2");
		
	}
}

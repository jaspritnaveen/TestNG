package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	
	@AfterMethod
			
	public void testcase1() {
		System.out.println("After Method------------>");
		
	}

	
	@BeforeMethod
	
	public void testcase6() {
		System.out.println("Before Method------------>");
		
	}
	@BeforeClass
	
	public void testcase9() {
		System.out.println("Before Class------------>");
		
	}
	
	
	@Test
	public void testcase2() {
		System.out.println("Test  ------------>");
		
	}
	
	@AfterClass
	public void testcase3() {
		System.out.println("After Class ------------>");
		
	}
	
	@AfterTest
	public void testcase4() {
		System.out.println("After Test ------------>");
		
	}
	
	@BeforeTest
	public void testcase5() {
		System.out.println("Before Test ------------>");
		
	}
	
	@AfterSuite
	public void testcase7() {
		System.out.println("After Suite ------------>");
		
	}
	
	@BeforeSuite
	public void testcase8() {
		System.out.println("Before Suite ------------>");
		
	}
	
	
}


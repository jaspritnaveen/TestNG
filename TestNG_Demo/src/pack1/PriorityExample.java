package pack1;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority = 1)
	public void testcase1() {
		System.out.println("Test case ----------->1");
		
	}

	@Test(priority = 2)
	public void testcase2() {
		System.out.println("Test case ------------>2");
		
	}

	@Test(enabled = false)
	public void testcase3() {
		System.out.println("Test case ------------>3");
		
	}
	@Test(priority =3)
	public void testcase4() {
		System.out.println("Test case ------------>4");
		
	}
	
	@Test(enabled = true)
	public void testcase5() {
		System.out.println("Test case ------------>5");
		
	}
	
	@Test(timeOut = 5000)
	public void testcase7() {
		System.out.println("Test case ------------>7");
		
	}
}

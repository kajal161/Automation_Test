package TestNGGroup;

import org.testng.annotations.Test;

public class TestngGroup1 {
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test 1");
	}
	@Test(groups= {"smoke","regression"})
	public void test2() {
		System.out.println("test 2");
	}
	@Test(groups= {"smoke","sanity","functional"})
	public void test3() {
		System.out.println("test 3");

}
	
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test 4");
	}
	@Test
	public void test5() {
		System.out.println("test 5");
	}

}

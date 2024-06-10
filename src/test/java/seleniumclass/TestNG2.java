package seleniumclass;

import org.testng.annotations.*;

public class TestNG2 {
	@Test
	public void test1() {
		System.out.println("Hey there");
	}
	@Test
	public void test2() {
		System.out.println("Hey there 2");
	}
	@Test
	public void a() {
		System.out.println("Hey there a");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Hey there beforemethod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Hey there aftermethod");
	}

}

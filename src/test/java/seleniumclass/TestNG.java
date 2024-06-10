package seleniumclass;

import org.testng.annotations.*;

public class TestNG {
	@Test
	public void test() {
		System.out.println("Hello");
	}
@BeforeTest
public void testbefore() {
	System.out.println("Hello before");
}
@AfterTest
public void testafter() {
	System.out.println("Hello after");
}
}

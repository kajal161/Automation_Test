package seleniumclass;

import org.testng.annotations.Test;

public class TestNGPriority {
	
		@Test(priority=-10)
		public void test1() {
			System.out.println("Hey there");
		}
		@Test(priority=1)
		public void test2() {
			System.out.println("Hey there 2");
		}
		@Test(priority=100)
		public void a() {
			System.out.println("Hey there a");

}
		//incase the priority is not set the priority by default will be 0
		@Test(priority=0)
		public void b() {
			System.out.println("Hey there b");
		}
		@Test
		public void b1() {
			System.out.println("Hey there b1");
		}
}
	
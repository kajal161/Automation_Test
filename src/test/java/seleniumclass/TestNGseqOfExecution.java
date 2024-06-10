package seleniumclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestNGseqOfExecution {
	public class TestClass2 {
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
		@BeforeTest
		public void beforetest() {
			System.out.println("Hey there beforetest");
		}
		@AfterTest
		public void aftertest() {
			System.out.println("Hey there aftertest");
			
		}
		@BeforeClass
		public void beforeclass() {
			System.out.println("Hey there beforeclass");
			
		}
		@AfterClass
		public void afterclass() {
			System.out.println("Hey there afterclass");
		}
		@BeforeSuite
		public void beforesuit() {
			System.out.println("Hey there beforesuite");
		}
		@AfterSuite
		public void aftersuite() {
			System.out.println("Hey there aftersuite");
		}
	}
}

package TestClass1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demo {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
	//	System.out.println("BeforeTest");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void test1() {
		System.out.println("Test1");
	}
		public void test3() {
			System.out.println("Test3");
		}
		public void test2() {
			System.out.println("Test12234");
	}
		public void AfterMethod() {
			
		}
		
		@AfterClass
		public void afterclaass() {
			System.out.println("After class");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("After Test");
		}
		@AfterSuite
		public void aeforeSuite() {
			System.out.println("After suite abc");
		}
			
}


package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {

		
		@BeforeTest
		public void beforeTest() {
			System.out.println("beforeTest");
		}
		@BeforeClass
		public void beforeTest1() {
			System.out.println("beforeTest1");
		}
		/*@BeforeClass
		public void beforeTest() {
			System.out.println("beforeTest");
		}*/
			
		@BeforeSuite
		public void beforSuit() {
			System.out.println("BeforeSuit");
		}
				
		@BeforeClass
		public void beforeClass() {
			System.out.println("beforeClass");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforeMethod");
		}
		
		@Test (priority = 1)
		public void test1() {
			System.out.println("Execute test1");
		}

		@Test
		public void test2() {
			System.out.println("Execute test2");
			
		}
		
		@Test (priority = 0)
		public void test3() {
			System.out.println("Execute test3");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("afterMethod");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("afterClass");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("afterTest");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("afterSuit");
		}


	}


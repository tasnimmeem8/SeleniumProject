package learnTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder2 {

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@Test
	public void test() {
		System.out.println("Test 1");
	}

}
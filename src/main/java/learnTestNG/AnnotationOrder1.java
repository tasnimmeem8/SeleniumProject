package learnTestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder1 {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Testing Annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After testing Annotation");
	}
	@Test
	public void test() {
		System.out.println("Execute testing");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite Annotation");
	}
	
	@AfterTest
	public void afterTest1() {
	System.out.println("After Test Annotation");	
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method annotation");
	}

	
	
	
	
	
	
	
	
	
}

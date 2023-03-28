package seleniumJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class AnnotationExecutionEx {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test
	public void Test1() {
		System.out.println("Test1");
	}

	@Test
	public void Test2() {
		System.out.println("Test2");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

}

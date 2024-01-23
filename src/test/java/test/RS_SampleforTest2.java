package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RS_SampleforTest2 {
	
	@BeforeTest
	public void testlevelbefore() {
		System.out.println("Run before test for test2 ");
	}
	
	@BeforeClass
	public void sampleClass2() {
		System.out.println("Before sample class2");
	}
	
	@Test
	public void testA() {
		System.out.println("Test A "+Thread.currentThread().getId());
	}
	
	@Test
	public void testB() {
		System.out.println("Test B "+Thread.currentThread().getId());
	}
	
	@Test
	public void testC() {
		System.out.println("Test C "+Thread.currentThread().getId());
	}
	
	@AfterClass
	public void asampleClass2() {
		System.out.println("After sample class2");
	}
	
	
	
	@AfterTest
	public void testlevelaftr2() {
		System.out.println("Run after test for test2 ");
	}
	
	
	

}

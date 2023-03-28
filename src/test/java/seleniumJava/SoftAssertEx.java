package seleniumJava;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	SoftAssert obj=new SoftAssert();
	
	@Test
	public void Test1() {
		int a=10;
		int b=20;
		int c=a+b;
//		Assert.assertEquals(c, 30);
//		Assert.assertTrue(c>30);
//		
//		Assert.assertEquals(c, 30);
//		Assert.assertEquals(c, 30);
//		Assert.assertEquals(c, 30);
//		
		obj.assertEquals(c, 30);
		System.out.println("1");
		obj.assertTrue(c>30);
		System.out.println("2");
		obj.assertEquals(c, 30);
		System.out.println("3");
		obj.assertEquals(c, 30);
		System.out.println("4");
		obj.assertEquals(c, 30);
		System.out.println("5");
		obj.assertAll();
		
	}
	

}

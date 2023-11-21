package TestingDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardvsSoftAssertion {
	@Test
	public void testHard() 
	{
		System.out.println("Hard Assertion");
		Assert.assertEquals(1, 2);
		System.out.println("Hard Assertion complete");
		Assert.assertEquals(1, 1);
	}
	/*@Test
	public void testSoft() 
	{
		System.out.println("Soft Assertion");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("Soft Assertion complete");
		sa.assertAll();
	}*/

}

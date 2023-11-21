package TestDay2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day2.ReturnText;


public class TestReturnText {
	 static int count=1;
	   @BeforeMethod
	   public void test() {
		   System.out.println("======"+count+"=======");
		   count++; 
		   
}
	   @DataProvider(name="DP1")
	   public Object[][] testData() {
	  	
	  	return new Object[][] {{"Srijida","Moideen"},{"Nazif","Nazar"},{"Muhammad","Nafis"},{"Naeema","Invalid"},{"abc","ced"}};
	  	
	  }
	  @Test(dataProvider="DP1")
	  public void lastName(String firstName,String Expected) {
	  	System.out.println("testing for input "+firstName);
	  	ReturnText rt=new ReturnText();
	  	Assert.assertEquals(rt.last(firstName), Expected);
	  	
	  	
	  }
}

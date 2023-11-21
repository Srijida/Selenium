package TestDay2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Day2.Capital_letter;

public class TestCapital_letter {
	 @DataProvider(name = "sentences")
	    public Object[][] sentences() {
	        return new Object[][] {
	            {"i am srijida", "I Am Srijida"},
	            {"hello world", "Hello World"},
	            {"god is love", "God Is Love"}
	        };
	    }

	    @Test(dataProvider = "sentences")
	    public void testCapitalizeFirstLetterOfWords(String input, String expected) {
	    	//Capital_letter ct=new Capital_letter();
	    	String result=Capital_letter.capitalizeFirstLetterOfWords(input);
	       
	        Assert.assertEquals(result, expected);
	    }
}

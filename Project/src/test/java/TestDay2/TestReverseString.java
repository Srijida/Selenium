package TestDay2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Day2.ReverseString;

public class TestReverseString {

    @Test(dataProvider = "sentencesToReverse")
    public void testReverseWords(String actual, String expectedReversed) {
        ReverseString rev = new ReverseString();
        String reversed = rev.reverseWords(actual);
        Assert.assertEquals(reversed, expectedReversed, "Word reversal failed!");
    }

    @DataProvider(name = "sentencesToReverse")
    public Object[][] provideReverse() {
        return new Object[][] {
                {"My Name is Srijida", "yM emaN si adijirS"},
                
        };
    }
}
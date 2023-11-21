package TestingDemo;

public class Reverse {
	public String stringReverse(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        String reversedval = reversed.toString();
        return reversedval;
    }

}

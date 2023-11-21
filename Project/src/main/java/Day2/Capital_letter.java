package Day2;

public class Capital_letter {
	public static String capitalizeFirstLetterOfWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            if (chars.length > 0) {
                chars[0] = Character.toUpperCase(chars[0]);
                modifiedSentence.append(chars).append(" ");
            }
        }

        if (modifiedSentence.length() > 0) {
            modifiedSentence.deleteCharAt(modifiedSentence.length() - 1);
        }

        return modifiedSentence.toString();
    }
}
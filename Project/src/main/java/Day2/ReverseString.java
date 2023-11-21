package Day2;

public class ReverseString {
    public String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            char[] characters = word.toCharArray();
            int left = 0;
            int right = characters.length - 1;

            while (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }

            reversedSentence.append(new String(characters)).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
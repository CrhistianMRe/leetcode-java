
public class Solution {

    public static void main(String[] args) {

        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));

    }

    public static int countCharacters(String[] words, String chars) {
        int totalCount = 0;

        int[] charCount = new int[26];

        for(int i = 0; i < chars.length(); i++) charCount[chars.charAt(i) - 'a']++;

        for(int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            int currentWordCount = 0;

            int[] wordCharCount = new int[26];

            for(int a = 0; a < currentWord.length(); a++) {

                int currentChar = currentWord.charAt(a) - 'a';

                wordCharCount[currentChar]++;

                int remainingChars = charCount[currentChar] - wordCharCount[currentChar];

                if(remainingChars >= 0) currentWordCount++;

            }

            if(currentWord.length() == currentWordCount) totalCount += currentWordCount;

        }

        return totalCount;

    }
    
}

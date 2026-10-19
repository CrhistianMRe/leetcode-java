import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

    }

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        final int patternLength = pattern.length();

        if(words.length != patternLength) return false;

        String[] letters = new String[26];

        Map<String, Integer> wordsMap = new HashMap<>();

        for(int i = 0; i < patternLength; i++) {

            int currentLetterIndex = pattern.charAt(i) - 'a';
            String currentWord = words[i];


            if(letters[currentLetterIndex] != null && !letters[currentLetterIndex].equals(currentWord) || (wordsMap.containsKey(currentWord) && !wordsMap.get(currentWord).equals(currentLetterIndex))) {
                return false;
            }

            letters[currentLetterIndex] = currentWord;
            wordsMap.put(currentWord, currentLetterIndex);

        }

        return true;

    } 
}

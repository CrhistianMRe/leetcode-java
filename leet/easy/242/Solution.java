import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        final int firstWordLength= s.length();
        final int secondWordLength = t.length();

        if(firstWordLength != secondWordLength) return false;

        Map<String, Integer> firstWordLetters = new HashMap<>();
        Map<String, Integer> secondWordLetters = new HashMap<>();

        for(int i = 0; i < firstWordLength; i++) {
            String firstCurrentLetter = String.valueOf(s.charAt(i));
            String secondCurrentLetter = String.valueOf(t.charAt(i));

            if(firstWordLetters.containsKey(firstCurrentLetter)) {
                firstWordLetters.put(firstCurrentLetter, firstWordLetters.get(firstCurrentLetter) + 1);

            } else {
                firstWordLetters.put(firstCurrentLetter, 0);
            }

            if(secondWordLetters.containsKey(secondCurrentLetter)) {
                secondWordLetters.put(secondCurrentLetter, secondWordLetters.get(secondCurrentLetter) + 1);

            } else {
                secondWordLetters.put(secondCurrentLetter, 0);
            }

        }

        return firstWordLetters.equals(secondWordLetters);
    }

    
}


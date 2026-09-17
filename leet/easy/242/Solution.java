import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        final int firstWordLength = s.length();
        final int secondWordLength = t.length();

        if(firstWordLength != secondWordLength) return false;

        Map<Character, Integer> firstWordLetters = new HashMap<>();
        Map<Character, Integer> secondWordLetters = new HashMap<>();

        for(int i = 0; i < firstWordLength; i++) {
            Character firstCurrentLetter = s.charAt(i);
            Character secondCurrentLetter = t.charAt(i);

            firstWordLetters.put(firstCurrentLetter, firstWordLetters.getOrDefault(firstCurrentLetter, 1) + 1);
            secondWordLetters.put(secondCurrentLetter, secondWordLetters.getOrDefault(secondCurrentLetter, 1) + 1);

        }

        return firstWordLetters.equals(secondWordLetters);
    }

    
}


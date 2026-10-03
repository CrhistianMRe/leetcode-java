import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egcd", "adfd"));

    }

    public static boolean isIsomorphic(String s, String t) {

        final int firstStringLength = s.length();

        final int secondStringLength = t.length();

        if(firstStringLength != secondStringLength) return false;

        Map<Character, Integer> firstMapping = new HashMap<>();

        Map<Character, Integer> secondMapping = new HashMap<>();

        for(int i = 0; i < firstStringLength; i++) {

            char currentFirstStringChar = s.charAt(i);
            char currentSecondStringChar = t.charAt(i);

            firstMapping.putIfAbsent(currentFirstStringChar, i);
            secondMapping.putIfAbsent(currentSecondStringChar, i);

            if(!firstMapping.get(currentFirstStringChar).equals(secondMapping.get(currentSecondStringChar))) return false;

        }


        return true;

    }
    
}  

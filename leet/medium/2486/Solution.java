public class Solution {

    public static void main(String[] args) {

    }

    public int appendCharacters(String s, String t) {

        final int firstWordLength = s.length();

        final int secondWordLength = t.length();

        int result = secondWordLength;

        int p1 = 0;

        int p2 = 0;

        while(p1 < firstWordLength && p2 < secondWordLength) {

            int firstWordCurrentLetter = s.charAt(p1);

            int secondWordCurrentLetter = t.charAt(p2);

            if(firstWordCurrentLetter == secondWordCurrentLetter) {
                p2++;
                result--;
            }

            p1++;

        }

        
    }

}

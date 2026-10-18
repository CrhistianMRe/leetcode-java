public class Solution {

    public static void main(String[] args) {

        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));

    }

    public static int maxNumberOfBalloons(String text) {

        final int textLength = text.length();

        int[] letters = new int[26];

        for(int i = 0; i < textLength; i++) {

            int currentLetterIndex = text.charAt(i) - 'a';

            letters[currentLetterIndex]++;
        }


        letters[11] = letters[11] / 2;
        letters[14] = letters[14] / 2;

        int min = 100000000;

        for(int i = 0; i < 26; i++) {
            if(i == 2) { i = 11; }
            else if(i == 12) { continue; }
            else if(i == 14) {
                if(letters[i] < min) min = letters[i];
                break;
            }

            if(letters[i] < min) min = letters[i];

        }


        return min;

    }

    
}

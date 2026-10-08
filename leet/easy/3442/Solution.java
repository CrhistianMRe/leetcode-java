public class Solution {

    public static void main(String[] args)  {
        System.out.println(maxDifference("aaaaabbc"));
    }

    public static int maxDifference(String s) {

        final int inputLength = s.length();

        int[] lettersCount = new int[26];

        for(int i = 0; i < inputLength; i++) {

            int currentChar = s.charAt(i) - 'a';

            lettersCount[currentChar] += 1;

        }

        int[] evenNumbers = new int[26];
        int[] oddNumbers = new int[26];

        for(int i = 0; i < 26; i++) {

            int currentLetterCount = lettersCount[i];

            if(currentLetterCount % 2 == 0) {
                evenNumbers[i] = lettersCount[i];
                continue;
            } 

            if(currentLetterCount % 2 != 0) {
                oddNumbers[i] = lettersCount[i];
            }

        }


        int maxDifference = -10000000;

        for(int i = 0; i < 26; i++) {
                if(evenNumbers[i] == 0) continue;

            for(int a = 0; a < 26; a++) {

                if(oddNumbers[a] == 0) continue;

                int currentDifference = oddNumbers[a] - evenNumbers[i];

                if(currentDifference > maxDifference) maxDifference = currentDifference;

            }


        }


        return maxDifference; 
    }

    
}

class Solution {

    public static void main(String[] args) {

    }

    public int scoreOfString(String s) {

        int result = 0;

        final int wordLength = s.length();

        int baseIndex = 0; 
        int rightIndex = 1;

        while(rightIndex < wordLength) {

            int baseIndexChar = s.charAt(baseIndex);
            int rightIndexChar = s.charAt(rightIndex);

            int initialDifference = baseIndexChar - rightIndexChar;

            result += Math.abs(initialDifference);

            baseIndex++;
            rightIndex++;
        }

        return result;
        
    }
}

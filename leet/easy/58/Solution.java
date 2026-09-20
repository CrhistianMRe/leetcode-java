public class Solution {

    public int lengthOfLastWord(String s) {

        int result = 0;

        final int stringLength = s.length();

        boolean firstNonSpaceHasBeenFound = false;

        for(int i = stringLength - 1; i > -1; i--) {

            int currentChar = s.charAt(i);

            if(currentChar != 32 && !firstNonSpaceHasBeenFound) {
                firstNonSpaceHasBeenFound = true;
                result++;
            } else if (firstNonSpaceHasBeenFound && currentChar != 32) {
                result++;
            } else if(currentChar == 32 && firstNonSpaceHasBeenFound) {
                break;
            }


        }
        
        return result;
    }

}

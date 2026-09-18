public class Solution2 {


    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {

        final int fullWordLength = t.length();

        final int supposedSubsquenceLength = s.length();

        int p2 = 0;
        int p1 = 0;

        while(p2 < supposedSubsquenceLength && p1 < fullWordLength){
            int currentFullWordLetter =  t.charAt(p1);
            int currentSupposedSubsequenceLetter = s.charAt(p2);

            if(currentFullWordLetter == currentSupposedSubsequenceLetter) p2++;

            p1++;
        }

        return supposedSubsquenceLength == p2;

    }
    
}

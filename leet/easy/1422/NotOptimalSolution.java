public class NotOptimalSolution {

    public int maxScore(String s) {

        int result = 0;

        int leftZeroCount = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == '0') leftZeroCount++;

            int currentRightOneCount = 0;

            for(int a = i + 1; a < s.length(); a++) if(s.charAt(a) == '1') currentRightOneCount++;

            int currentTotal = leftZeroCount + currentRightOneCount;

            if(result < currentTotal) result = currentTotal;

        }

        return result;

    }

    
}

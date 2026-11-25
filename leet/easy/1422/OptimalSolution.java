public class OptimalSolution {

    public static void main(String[] args){}


    public static int maxScore(String s) {

        int result = 0;

        final int stringLength = s.length();

        int leftZeroCount = 0;

        for(int i = 0; i < stringLength - 1; i++) if(s.charAt(i) == '0') leftZeroCount++;

        int rightOneCount = 0;

        for(int i = stringLength - 1; i > 0; i--) {
            if(s.charAt(i) == '1') {
                rightOneCount++;
            } else {
                if(i != stringLength - 1) leftZeroCount--;
            }

            int currentSum = leftZeroCount + rightOneCount;

            if(result < currentSum) result = currentSum;
        }

        return result;
    }
}
    

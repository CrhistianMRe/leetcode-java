public class Solution {

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,2}));
    }

    public static int longestMonotonicSubarray(int[] nums) {

        final int numsLength = nums.length;

        int currentCount = 1;

        int max = currentCount;

        boolean isIncreasing = false;

        boolean isDecreasing = false;

        for(int i = 0; i < numsLength - 1; i++) {

            boolean isNextNumGreater = nums[i] < nums[i + 1];
            boolean isNextNumSmaller = nums[i] > nums[i + 1];

            if(!isNextNumSmaller && !isNextNumGreater) {
                isIncreasing = false;
                isDecreasing = false;
                if(currentCount > max) max = currentCount;
                currentCount = 1;
                continue;
            }

            if(isIncreasing && isNextNumGreater || isDecreasing && isNextNumSmaller) {
                currentCount++;
                continue;
            }



            if(!isIncreasing && !isDecreasing) {   

                if(isNextNumSmaller){ isDecreasing = true;} else { isIncreasing = true; }
                currentCount++;
                continue;
            }



            isIncreasing = false;
            isDecreasing = false;
            if(currentCount > max) max = currentCount;
            currentCount = 1;
            i--;

        }

        if(currentCount > max) max = currentCount;
        return max;

    }
    
}

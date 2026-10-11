public class Solution {  

    public static void main(String[] args) {

    }

    public static int maxAscendingSum(int[] nums) {

        final int numsLength = nums.length;

        if(numsLength < 2) return nums[0];

        int maxSum = 0; 

        int currentMaxSum = 0;

        boolean isIncreasing = false;

        for(int i = 0; i < numsLength - 1; i++) {

            boolean isNextGreater = nums[i + 1] > nums[i];

            if(isNextGreater && isIncreasing) {
                currentMaxSum = currentMaxSum + nums[i + 1];
                continue;
            }

            if(isNextGreater && !isIncreasing) {
                currentMaxSum = nums[i] + nums[i + 1] + currentMaxSum;
                isIncreasing = true;
                continue;
            }

            if(!isNextGreater && !isIncreasing) { currentMaxSum = nums[i]; }

            isIncreasing = false;
            if(currentMaxSum > maxSum) maxSum = currentMaxSum;
            currentMaxSum = 0;

        }

        if(currentMaxSum > maxSum) maxSum = currentMaxSum;

        return maxSum;
    }

}

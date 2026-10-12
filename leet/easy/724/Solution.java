public class Solution {

    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {

        final int numsLength = nums.length;

        for(int i = 0; i < numsLength; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int a = 0; a < i; a++) {
                leftSum += nums[a];

            }

            for (int m = numsLength -1; m > i; m--) {
                rightSum += nums[m];
            }

            if(leftSum == rightSum) return i;

        }

        return -1;

    }


    
}

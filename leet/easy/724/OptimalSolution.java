public class OptimalSolution {

    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {

        final int numsLength = nums.length;

        int leftSum = 0;
        int rightSum = 0;


        for (int m = 0; m < numsLength; m++) {
            rightSum += nums[m];
        }

        for(int i = 0; i < numsLength; i++) {

            if(i != 0) leftSum += nums[i - 1];

            if(leftSum == rightSum - nums[i] - leftSum) return i;

        }

        return -1;

    }


    
}


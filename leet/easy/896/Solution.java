public class Solution {

    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {

        final int arrayLength = nums.length;

        boolean isIncreasing = false;

        boolean isOrderDecided = false;

        if(arrayLength < 2) return true;

        for(int i = 1; i < arrayLength; i++) {


            if(!isOrderDecided) {

                if(nums[i - 1] < nums[i]) {
                    isOrderDecided = true;
                    isIncreasing = true;
                } 

                if(nums[i - 1] > nums[i]) {
                    isOrderDecided = true;
                } 

                continue;
            } 

            if(isIncreasing) {

                if(nums[i - 1] > nums[i]) return false;

            } else {

                if(nums[i - 1] < nums[i]) return false;
            }


        }

        return true;
    }



    
}

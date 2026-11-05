public class Solution {

    public boolean isArraySpecial(int[] nums) {

        final int arrayLength = nums.length;

        if(arrayLength == 1) return true;

        int p1 = 0;
        int p2 = 1;

        while(p2 < arrayLength) {

            //If both boolean are the same
            if((nums[p1] % 2 == 0) == (nums[p2] % 2 == 0)) return false;

            p1++;
            p2++;
        }

        return true;
    }



} 

class Solution {

    public static void main(String[] args) {

        int result = Solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});

        System.out.println(result);


    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        final int arrayLength = nums.length;

        int max = 0;

        int count = 0;

        for(int i = 0; i < arrayLength; i++) {

            if(nums[i] == 1) { count++; } else { 
                count = 0;
            }
            if(count > max){ max = count; }

        }

        return max;
        
    }

}

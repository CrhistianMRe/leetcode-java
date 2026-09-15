public class Solution {

    public static void main(String[] args) {  

        final int[] nums = {2, 1};

        Solution solution = new Solution();

        solution.getConcatenation(nums);

    }

    public int[] getConcatenation(int[] nums) {
        final int inputArrayLength = nums.length;

        int[] result = new int[inputArrayLength * 2];

        boolean hasBeenDuplicated = false;

        int count = 0; 

        for(int i = 0 ; i < inputArrayLength; i++) {

            result[count] = nums[i];

            if(i == inputArrayLength - 1  && !hasBeenDuplicated) { 
                i = -1; 
                hasBeenDuplicated = true;
            }

            count++;
        }

        return result;
        
    }

}

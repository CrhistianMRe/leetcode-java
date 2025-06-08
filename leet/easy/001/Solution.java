
class Solution {

    Solution(){}
    protected int[] twoSum(int[]nums, int target) {

        int first = 0;
        int second = 0;
        int count = 0;
        int[] index = new int[2];

        for (first = 0 ; first < nums.length; first++) {
            for (second = 0; second < nums.length; second++) {
                   if (((nums[first] + nums[second]) == target) && (first != second && count == 0)) {
                        System.out.println("[" + first + "," + second + "]"); 
                        index[0]= first;
                        index[1]= second;
                        count++;
                    } 
            }   
        }
            
        return index;
    }
    
}

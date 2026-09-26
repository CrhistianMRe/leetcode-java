class Solution {
    public int removeElement(int[] nums, int val) {

        final int numsLength = nums.length;

        int[] resultArray = new int[numsLength];

        int resultCount = 0;

        for(int i = 0; i < numsLength; i++) {

            if(nums[i] != val) {
                resultArray[resultCount] = nums[i];
                resultCount++;
            }

        }

        for(int i = 0; i < resultCount; i++) {
            nums[i] = resultArray[i];
        }


        return resultCount;
    }

}

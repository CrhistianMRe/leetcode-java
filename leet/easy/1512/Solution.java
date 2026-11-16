public class Solution {

    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {

        int countPairs = 0;

        int[] countNums = new int[100];

        for(int i = 0; i < nums.length; i++) countNums[nums[i] - 1]++;

        for(int i = 0; i < countNums.length; i++) countPairs += countNums[i] * (countNums[i] - 1)/ 2;

        return countPairs;

    }

    
}

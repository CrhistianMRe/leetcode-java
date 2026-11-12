public class Solution {

    public static void main(String[] args) {

    }

    public boolean check(int[] nums) {

        final int arrayLength = nums.length;

        int countChecks = 0;

        for(int i = 0; i < arrayLength; i++) {

            int[] rotatedArray = new int[arrayLength];

            int newPositionCount = 0;

            //Not rotated numbers
            for(int a = i + 1; a < arrayLength; a++) {
                rotatedArray[newPositionCount] = nums[a];
                newPositionCount++;
            }

            //Rotated numbers
            for(int a = 0; a <= i; a++) {
                rotatedArray[newPositionCount] = nums[a];
                newPositionCount++;
            }

            if(!isSorted(rotatedArray)) countChecks++;

        }

        return !(countChecks == arrayLength);

    }

    private static boolean isSorted(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(i != nums.length - 1&& nums[i] > nums[i + 1]) return false;
        }

        return true;

    }
    
}

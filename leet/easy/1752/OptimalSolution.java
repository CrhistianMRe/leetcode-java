public class OptimalSolution {

    public static void main(String[] args) {

    }
    public boolean check(int[] nums) {

        int countBreak = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i == nums.length -1) {
                if(nums[0] < nums[i]) countBreak++;
                break;
            }

            if(nums[i] > nums[i + 1]) countBreak++;

        }

        return countBreak < 2;

    }
    
}

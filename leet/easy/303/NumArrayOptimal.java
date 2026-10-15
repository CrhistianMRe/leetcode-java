public class NumArrayOptimal {

    final int[] nums;

    final int numsLength;

    final int[] prefixSum;

    public NumArrayOptimal(int[] nums) {
        this.nums = nums;
        this.numsLength = nums.length;
        this.prefixSum = new int[numsLength];

        int sum = 0;

        for(int i = 0; i < numsLength; i++) {
            sum += this.nums[i];
            prefixSum[i] = sum;
        }

    }

    public int sumRange(int left, int right) {
        if(left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }


}


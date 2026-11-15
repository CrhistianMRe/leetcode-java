import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static void main(String[] args) {

    }

    public boolean divideArray(int[] nums) {

        final int arrayLength = nums.length;

        Map<Integer, Integer> pairs = new HashMap<>() ;

        for(int i = 0;  i < arrayLength; i++) {
            pairs.merge(nums[i], 1, (oldValue, value) -> oldValue + value);
        }

        for(Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            if(!(entry.getValue() % 2 == 0)) return false;
        }

        return true;

    }
    
}

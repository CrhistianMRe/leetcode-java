import java.util.HashMap;
import java.util.Map;

public class Solution {


    public boolean containsDuplicate(int[] nums) {

        boolean result = false;

        final int arrayLength = nums.length;

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < arrayLength; i++) {

            if(numsMap.put(nums[i], i) != null){ 
                result = true;
                break;
            }

        }

        return result;


    }

    
}

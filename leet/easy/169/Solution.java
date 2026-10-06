import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int majorityElement(int[] nums) {

        int current = nums[0];

        int countCurrent = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != current) { 
                countCurrent--;
            } else {
                countCurrent++;
            }

            if(countCurrent == 0) { 
                current = nums[i]; 
                countCurrent++;
            }

        }


        return current;

    }
    
}


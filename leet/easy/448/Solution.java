import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).forEach(System.out::println);

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disapperedNumberList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            int actualIndex = Math.abs(nums[i]) - 1;

            nums[actualIndex] = nums[actualIndex] < 0 ? nums[actualIndex] : Math.negateExact(nums[actualIndex]);

        }


        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) disapperedNumberList.add(i + 1);
        }


        return disapperedNumberList; 

    }

    
}

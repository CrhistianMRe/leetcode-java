import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        final int rowAmount = grid.length;
        final int columnAmount = grid[0].length;

        Map<Integer, Integer> numbers = new HashMap<>();

        for(int row = 0; row < rowAmount; row++) {

            for(int column = 0; column < columnAmount; column++) {

                int currentValue = grid[row][column];

                numbers.merge(currentValue, 1, (value, newValue) -> value + newValue);

            }

        }

        int[] result = new int[2];

        numbers.forEach((key, value) -> { if(value.equals(2)) { result[0] = key; return; } });

        for(int i = 1; i <= rowAmount * columnAmount; i++) {
            if(numbers.get(i) == null) {
                result[1] = i;
                break;
            }
        }

        return result;

    }
    
}

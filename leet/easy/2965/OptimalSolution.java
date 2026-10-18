import java.util.HashMap;
import java.util.Map;

public class OptimalSolution {

    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        final int rowAmount = grid.length;
        final int columnAmount = grid[0].length;
        final int matrixSize = rowAmount * columnAmount;

        int[] numsCount = new int[matrixSize];

        for(int row = 0; row < rowAmount; row++) {

            for(int column = 0; column < columnAmount; column++) {

                int currentValue = grid[row][column]-1;

                numsCount[currentValue]++;

            }

        }

        int[] result = new int[2];


        for(int i = 0; i < matrixSize; i++) {
            if(numsCount[i] == 2) result[0] = i+1;
            if(numsCount[i] == 0) result[1] = i+1;
        }

        return result;

    }
    
}


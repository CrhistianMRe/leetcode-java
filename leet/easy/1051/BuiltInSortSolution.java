import java.util.Arrays;

public class BuiltInSortSolution {

    public int heightChecker(int[] heights) {
        int[] heightsCopy = Arrays.copyOf(heights, heights.length);

        Arrays.sort(heights);

        int count = 0;

        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != heightsCopy[i]) count++;
        }

        return count;
    }

    
}


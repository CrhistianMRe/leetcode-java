public class NotThatOptimalSolution {

    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        final int rowAmount = grid.length;
        final int columnAmount = grid[0].length;

        Map<Integer, Integer> numbers = new HashMap<>();

        for(int row = 0; row < rowAmount; row++) {

            for(int column = 0; column < columnAmount; column++) {

                int currentValue = grid[row][column];

                if(numbers.containsKey(Math.negateExact(currentValue))) {
                    numbers.put(777, currentValue);
                }



                numbers.put(Math.negateExact(currentValue), 1);

            }

        }

        int[] result = new int[2];

        result[0] = numbers.get(777);

        for(int i = 1; i <= rowAmount * columnAmount; i++) {
            if(numbers.get(Math.negateExact(i)) == null) {
                result[1] = i;
                break;
            }
        }

        return result;

    }
    
}


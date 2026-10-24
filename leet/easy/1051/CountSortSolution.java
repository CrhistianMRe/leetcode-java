class CountSortSolution {


    public static void main(String[] args) {

        System.out.println(heightChecker(new int[]{3,3,5,9,9,3,2,9,10,2,3,2,3,6,5,9,10,10,6,6,2,3,9,9,9}));

    }

    public static int heightChecker(int[] heights) {

        int[] countNums = new int[100];

        for(int i = 0; i < heights.length; i++) { 
            countNums[heights[i] - 1]++; 

        }

        int[] orderedItems = new int[heights.length];

        int currentIndex = 0;

        for(int i = 0; i < 100; i++) {

            if(countNums[i] > 0) {
                orderedItems[currentIndex] = i + 1;
                countNums[i]--;
                currentIndex++;
                i--;
                continue;
            } 


        }

        int result = 0;

        for(int i = 0; i < heights.length; i++) {

            if(heights[i] != orderedItems[i]) result++;

        }


        return result;
    }
    
}

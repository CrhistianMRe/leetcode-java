import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {


        generate(5).forEach(System.out::println);

    }

    public static List<List<Integer>> generate(int numRows) {
        if(numRows < 2) return List.of(List.of(1));

        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(1));

        int currentRow = 3;

        List<Integer> lastRowList = buildCurrentLayer(null, 1);

        result.add(lastRowList);

        while(currentRow <= numRows) {

            lastRowList = buildCurrentLayer(lastRowList, currentRow);
            result.add(lastRowList);
            currentRow++;

        }

        return result;
        
    }


    public static List<Integer> buildCurrentLayer(final List<Integer> lastRow, final int currentLayer) {

        int previousRowFirstPointer = 0;
        int previousRowSecondPointer = 1;

        int lastIndexOfRow = currentLayer - 1;
        int firstIndexOfRow = 0;

        int currentIndex = 1;

        List<Integer> currentRowList = new ArrayList<>();

        currentRowList.add(1);

        while(currentIndex < lastIndexOfRow && currentIndex > firstIndexOfRow) {

            int sumOfPointers = lastRow.get(previousRowFirstPointer) + lastRow.get(previousRowSecondPointer);

            currentRowList.add(sumOfPointers);

            previousRowFirstPointer++;
            previousRowSecondPointer++;
            currentIndex++;
        }

        currentRowList.add(1);

        return currentRowList;

    }


}

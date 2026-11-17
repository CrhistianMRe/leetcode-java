import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        System.out.println(getRow(10));

    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex +=1;

        if(rowIndex == 1) return List.of(1);

        List<Integer> lastRow = new ArrayList<>(List.of(1,1));

        List<Integer> currentRow = new ArrayList<>();

        for(int i = 2; i < rowIndex; i++) { 
            currentRow = new ArrayList<>();

            int lastRowLeftIndex = 0;
            int lastRowRightIndex = 1;

            currentRow.add(1);
            while(lastRowRightIndex < i){

                int sumOfPointers = lastRow.get(lastRowLeftIndex) + lastRow.get(lastRowRightIndex);

                lastRowLeftIndex++;
                lastRowRightIndex++;

                currentRow.add(sumOfPointers);


            }
            currentRow.add(1);

            lastRow = currentRow;

        }


        return lastRow;
    }

    
}

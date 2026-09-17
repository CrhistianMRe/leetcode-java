public class Solution {

    public int[] replaceElements(int[] arr) {

        final int arrayLength = arr.length;

        for(int i = 0; i < arrayLength; i++) {
            int max = 0;

            if(i == arrayLength - 1) {
                arr[i] = -1;
                break;
            }

            for(int a = i+1; a < arrayLength; a++) if(max < arr[a]) max = arr[a];
            
            arr[i] = max;
        }

        return arr;
        
    }
    
}

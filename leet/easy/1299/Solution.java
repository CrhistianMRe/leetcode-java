public class Solution {

   public int[] replaceElements(int[] arr) {

       final int arrayLength = arr.length;

        //It starts with -1 as the last index will be always -1 
        int currentMax = - 1;
        
        
        //This keeps track of the largest right-side number as it is decreasing
        for(int i = arrayLength - 1; i >= 0; i--) {

            int temp = arr[i];

            arr[i] = currentMax;

            if(temp > currentMax)  currentMax = temp;
            
        }

        return arr;
    } 
}

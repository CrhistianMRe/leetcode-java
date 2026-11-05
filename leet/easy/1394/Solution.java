import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

    }

    public int findLucky(int[] arr) {

        Map<Integer, Integer> numCount = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            numCount.merge(arr[i], 1, (previousValue, value) -> value + previousValue);
        }

        int largest = 0;


        for(Map.Entry<Integer, Integer> entry : numCount.entrySet()){
            int key = entry.getKey();
            if(entry.getValue().equals(key)) if(largest < key) largest = key;
        }


        if(largest == 0) return -1;

        return largest;
    }


} 

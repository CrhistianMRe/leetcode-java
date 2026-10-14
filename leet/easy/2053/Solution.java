import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public String kthDistinct(String[] arr, int k) {

        final int arrayLength = arr.length;

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for(int i = 0; i < arrayLength; i++) {
            wordCount.merge(arr[i], 1, (value1, newValue) -> value1 + newValue);
        }


        String result = "";

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){


            String key = entry.getKey();
            Integer value = entry.getValue();


            if(value == 1) k--;

            if(k == 0) {
                result = key; 
                break;
            }

        }
        return result;

    }

    
}

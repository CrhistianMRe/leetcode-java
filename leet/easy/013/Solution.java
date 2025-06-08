
import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public int romanToInt(String s){

        Map<String, Integer> romanList = new HashMap<String, Integer>();

        Map<String, Integer> romanLess = new HashMap<String, Integer>();

        int sum = 0;
        romanList.put("I", 1);
        romanList.put("V", 5);
        romanList.put("X", 10);
        romanList.put("L", 50);
        romanList.put("C", 100);
        romanList.put("D", 500);
        romanList.put("M", 1000);

        romanLess.put("IV", 4);
        romanLess.put("IX", 9);
        romanLess.put("XL", 40);
        romanLess.put("XC", 90);
        romanLess.put("CD", 400);
        romanLess.put("CM", 900);

        String lessString="";


        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (i < s.length()-1) {

                lessString = (String.valueOf(s.charAt(i) + String.valueOf(s.charAt(i+1))));


            }
            if(romanLess.containsKey(lessString)){

                sum += romanLess.get(lessString);

                System.out.println("Combinacion " + i + ": " + lessString);
                i +=1;
                lessString="";

            }else{

                sum += (romanList.get(String.valueOf(s.charAt(i))));

            }
         } 
        return sum;
    }
    
}

import java.util.HashMap;
import java.util.Map;

public class Optimal {

    public static void main(String[] args) {
        final String s = "bccddadcb";

        final int result = lengthOfLongestSubstring(s);

        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int solution = 0;
        int tempCount = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        Map<Character, Integer> characterPositions = new HashMap<>();

        while(rightPointer < s.length() && leftPointer < s.length()) {
            char rightPointerCharacter = s.charAt(rightPointer);
            
            Integer previousIndex = characterPositions.put(rightPointerCharacter, rightPointer);

            //Checks if there was a value before persisting
            if (previousIndex != null && previousIndex >= leftPointer) {
                leftPointer = previousIndex + 1;
                if(solution < tempCount) {
                    solution = tempCount;
                }
                tempCount = rightPointer - leftPointer + 1;
            } else {
                tempCount++;
            }

            rightPointer++;

        }

        if(solution < tempCount) {
            solution = tempCount;
        }

        return solution;
    }


}  

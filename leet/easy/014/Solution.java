public class Solution {

    public static void main(String[] args) {
        String[] strs1 = {"flower","fkow"};
        String[] strs2 = {"dog", "racecar"};
        String[] strs3 = {"", "b"};

        System.out.println(longestCommonPrefix(strs1));

    }

    public static String longestCommonPrefix(String[] strs) {

        //This problem is first iterating through the first letter of each element in the array and doing that consecutevily veryfing all are start and continue the same

        final int arrayLength = strs.length;

        String prefix = strs[0];

        int currentPrefixLength = prefix.length();
        if(currentPrefixLength < 1) return "";

        for(int element = 1; element < arrayLength; element++) {

            String currentElement = strs[element];
            if(currentElement.length() < 1) return "";

            if(currentElement.length() < currentPrefixLength) {
                element = element - 1;
                prefix = prefix.substring(0, currentElement.length());
                currentPrefixLength = prefix.length();
            } else if (!prefix.equals(currentElement.substring(0, currentPrefixLength))) {
                element = element - 1;
                currentPrefixLength--;
                prefix = prefix.substring(0, currentPrefixLength);
            }


        }


        return prefix;
    }


}

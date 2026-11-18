public class Solution {


    public static void main(String[] args) {

    }


    public boolean canConstruct(String toConstruct, String chars) {

        int[] charsCount = new int[26];

        for(int i = 0; i < chars.length(); i++) charsCount[chars.charAt(i) - 'a']++;

        for(int i = 0; i < toConstruct.length(); i++) {   

            int currentChar = toConstruct.charAt(i) - 'a';

            charsCount[currentChar]--;

            if(charsCount[currentChar] < 0) return false;

        }

        return true;

    }


}

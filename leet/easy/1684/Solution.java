public class Solution {

    public static void main(String[] args) {

        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int result = 0;

        int[] allowedChars = new int[26];

        for(int i = 0; i < allowed.length(); i++) allowedChars[allowed.charAt(i) - 'a']++;

        for(int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            for(int a = 0; a < currentWord.length(); a++) { 
                if(allowedChars[currentWord.charAt(a) - 'a'] == 0) break; 

                if(a == currentWord.length() - 1) result++;
            }


        }

        return result;
    }


    
}

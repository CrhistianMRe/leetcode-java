import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).forEach(System.out::println);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        final int arrayLength = strs.length;

        List<List<String>> listOfAnagramGroups = new ArrayList<>();

        for(int i = 0; i < arrayLength; i++) {


            List<String> currentGroup = new ArrayList<>();

            String currentMainWord = strs[i];

            if(currentMainWord.equals("0")) continue;

            for(int a = 0; a < arrayLength; a++) {
                String currentSecondaryWord = strs[a];

                if(currentSecondaryWord.equals("0")) continue;

                if(i == a) {
                    currentGroup.add(currentMainWord);
                    strs[i] = "0";
                    continue;
                }


                int firstWordLenght = currentMainWord.length();
                int secondWordLenght = currentSecondaryWord.length();

                if(firstWordLenght != secondWordLenght) continue;

                boolean isCurrentAnagram = true;

                int[] lettersCount = new int[26];

                for(int letterIndex = 0; letterIndex < firstWordLenght ; letterIndex++) {

                    int firstWordLetterIndex = currentMainWord.charAt(letterIndex) - 'a';
                    int secondWordLetterIndex = currentSecondaryWord.charAt(letterIndex) - 'a';

                    lettersCount[firstWordLetterIndex]++;
                    lettersCount[secondWordLetterIndex]--;

                }

                for(int l = 0; l < 26; l++) {
                    if(lettersCount[l] != 0) {
                        isCurrentAnagram = false;
                        break;
                    }

                }

                if(isCurrentAnagram) {
                    currentGroup.add(currentSecondaryWord);
                    strs[a] = "0";
                }
                        

            }


            listOfAnagramGroups.add(currentGroup);



        }

        return listOfAnagramGroups;


    }

}

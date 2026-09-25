import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {

    public static void main(String[] args) {

        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).forEach(System.out::println);

    }

    public static class IntegerArray {

        private int[] array;

        IntegerArray(int[] array) {
            this.array = array;
        }

        public int[] getArray() {
            return array;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(array);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            IntegerArray other = (IntegerArray) obj;
            if (!Arrays.equals(array, other.array))
                return false;
            return true;
        }


    }



    public static List<List<String>> groupAnagrams(String[] strs) {

        final int arrayLength = strs.length;

        Map<IntegerArray, List<String>> mapOfAnagramGroups = new HashMap<>();

        List<List<String>> listOfAnagramGroups = new ArrayList<>();

        for(int i = 0; i < arrayLength; i++) {

            String currentMainWord = strs[i];

            int[] lettersCount = new int[26];

            int currentWordLenght = currentMainWord.length();

            for(int letterIndex = 0; letterIndex < currentWordLenght; letterIndex++) {

                int firstWordLetterIndex = currentMainWord.charAt(letterIndex) - 'a';

                lettersCount[firstWordLetterIndex]++;

            }

            IntegerArray wrapper = new IntegerArray(lettersCount);

            mapOfAnagramGroups.computeIfAbsent(wrapper, k -> new ArrayList<>()).add(currentMainWord);


        }

        mapOfAnagramGroups.forEach((key, value) -> listOfAnagramGroups.add(value));

        return listOfAnagramGroups;

    }

}

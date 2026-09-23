import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        stringMatching(new String[]{"leetcoder","leetcode","od","hamlet","am"}).forEach(System.out::println);

    }

    public static List<String> stringMatching(String[] words) {

        List<String> substringList = new ArrayList<>();

        final int wordsArrayLenght = words.length;

        for(int element = 0; element < wordsArrayLenght; element++) {

            for(int nestedElement = 0; nestedElement < wordsArrayLenght; nestedElement++) {
                if(element == nestedElement) continue;

                String currentElement = words[element];
                String currentNestedElement = words[nestedElement];

                if(currentNestedElement.contains(currentElement)) {
                    substringList.add(currentElement);
                    break;
                }

            }

        }

        return substringList;

    }
    
}


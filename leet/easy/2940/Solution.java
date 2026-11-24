public class Solution {

    public boolean isCircularSentence(String sentence) {

        final int sentenceLength = sentence.length();

        //This means first sentence last char hasn't been recorded
        char lastCharOfSentence = ' ';

        for(int i = 1; i < sentenceLength; i++) {

            char firstPointerChar = sentence.charAt(i - 1);
            char secondPointerChar = sentence.charAt(i);


            if(secondPointerChar == ' ') lastCharOfSentence = firstPointerChar;

            if(firstPointerChar == ' ') if(secondPointerChar != lastCharOfSentence) return false;

        }

        return sentence.charAt(0) == sentence.charAt(sentenceLength - 1);

    }

    
}

public class OptimalSolution {

    public static void main(String[] args) {
        
    }

    public boolean isAnagram(String s, String t) {

        final int firstWordLength = s.length();
        final int secondWordLength = t.length();

        if(firstWordLength != secondWordLength) return false;

        int[] lettersCount = new int[26];

        for(int i = 0; i < firstWordLength; i++) {
            //This does get the index for the 26 letters of the alphabet, so it counts how many per letter
            int indexToIncrement = s.charAt(i) - 'a';
            int indexToDecrease = t.charAt(i) - 'a';

            lettersCount[indexToDecrease]--;
            lettersCount[indexToIncrement]++;

        }

        for (int i = 0; i < 26; i++) if(lettersCount[i] != 0)  return false; 

        return true;
    }
    
}

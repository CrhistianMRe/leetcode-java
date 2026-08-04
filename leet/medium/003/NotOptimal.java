public class NotOptimal {

    public static void main(String[] args) {
        final String s = "abcabccbb";

        final int result = lengthOfLongestSubstring(s);

        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {

        int solution = 0;

        for(int i = 0; i < s.length(); i++){
            String subString = "";
            subString = subString.concat(String.valueOf(s.charAt(i)));
            int maxLength = 1;

            for(int a = i + 1; a < s.length(); a++){
                String secondCharacter = String.valueOf(s.charAt(a));
                if(!subString.contains(secondCharacter)) {
                    maxLength ++;
                    subString = subString.concat(secondCharacter);
                } else { break; }
            }

            if(solution < maxLength) {
                solution = maxLength;
            }
            maxLength = 0;
        }
        return solution;
    }

}

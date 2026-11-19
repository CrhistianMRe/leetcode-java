
public class Solution {

    public static void main(String[] args) {

    }

    public String largestGoodInteger(String num) {

        int countSameNum = 1;

        int lastNum = num.charAt(0) - '0';

        int result = -1;

        //Esto no funciona porque tiene que ser una substring, Mejor hace solo una pasada y que vaya checkeando los substring con eso deberias poder hacerlo en O(n)
        for(int i = 1; i < num.length(); i++) {

            int currentNum = num.charAt(i) - '0';

            if(lastNum == currentNum) { countSameNum++; } else { countSameNum = 1; }

            lastNum = currentNum;

            if(countSameNum == 3) {
                countSameNum = 0;

                if(currentNum > result) result = currentNum;

            }
        }

        if(result == -1) return "";
        return new StringBuilder().append(result).append(result).append(result).toString();

    }
}

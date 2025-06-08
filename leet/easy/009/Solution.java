/**
 * Solution
 */

class Solution {

    Solution(){}

    public boolean isPalindrome(int x){
        boolean palin = false;

        String cadena = String.valueOf(x);

        String rCadena = "";

        int count = 0;

        for (int i = cadena.length()-1; i >= 0 ; i--) {
            rCadena += cadena.charAt(i);
        }

        System.out.println("Primera cadena : " + cadena.length());
        System.out.println("Primera cadena texto: " + cadena);
        System.out.println("Segunda cadena : " + rCadena.length());
        System.out.println("Segunda cadena texto: " + rCadena);

        while(rCadena.charAt(count) ==  cadena.charAt(count)) {
            if(count != (cadena.length()-1)){
                count++;
            }else{
                break;
            }
        }

        if (count == (cadena.length()-1)){
            palin = true;
        }

        return palin;
    }

}

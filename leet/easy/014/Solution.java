
public class Solution {
    public String longestCommonPrefix(String[] strs){
        String prefix = "";
        String testword = "";
        int count = 0;

        //Puedo intentar crear un array de prefijos en base a obtener los primeros chars
        for(int i = 0; i < strs.length; i++){
            for(int c = 0; c < strs.length; c++){
                //Si el array esta vacio
                if (!(strs[i].isEmpty()&& count < strs[i].length())){

                    if(strs.length == 1 ||(strs[c].startsWith(testword))){
                        //Si el tamanio es de 1 o el cada 
                        prefix = testword;

                    }
                    //Sumar los chars de la primera palabra del array y asi consecutivamente
                    testword += String.valueOf(strs[i].charAt(c));
                    count++;


                }else {

                    break;

                }

            }

        }


        return prefix;
    }

    
}

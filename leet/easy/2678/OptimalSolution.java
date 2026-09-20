class Solution {

    public int countSeniors(String[] details) {

        int result = 0;

        final int detailsArrayLength = details.length;


        for(int i = 0; i < detailsArrayLength; i++) {

            String currentDetail = details[i];

            int tens = currentDetail.charAt(11);

            int ones = currentDetail.charAt(12);


            // 54 = 6 decimal, 48 = 0 decimal
            if(tens > 54 || (tens == 54 && ones > 48)) { result++; }

        }

        return result;
        
    }

}


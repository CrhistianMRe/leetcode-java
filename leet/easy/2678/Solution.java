class Solution {

    public int countSeniors(String[] details) {

        int result = 0;

        final int detailsArrayLength = details.length;


        for(int i = 0; i < detailsArrayLength; i++) {

            String currentDetail = details[i];

            int age = Integer.valueOf(currentDetail.charAt(11) + currentDetail.charAt(12));

            if(age > 60){ result++; }

        }

        return result;
        
    }

}

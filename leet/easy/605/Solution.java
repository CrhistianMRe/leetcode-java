public class Solution {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        final int flowerbedLength = flowerbed.length;

        int countSlots = 0;

        for(int i = 0; i < flowerbedLength; i++) {

            boolean isLeftValid = (i == 0 || flowerbed[i - 1] == 0);
            boolean isRightValid = (i == flowerbedLength - 1 || flowerbed[i + 1] == 0);
            boolean isCurrentValid = flowerbed[i] == 0;


            if(isLeftValid && isRightValid && isCurrentValid) {
                countSlots++;
                flowerbed[i] = 1;
            }

        }


        return countSlots >= n;
    }

    
}

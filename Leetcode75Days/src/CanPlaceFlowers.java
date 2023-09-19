public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag = 0;
        if(flowerbed.length >=1 && flowerbed[0]==0){
            flowerbed[0] = 1;
            flag++;
        } else if (flowerbed[flowerbed.length-2] == 0 && flowerbed[flowerbed.length-1] == 0) {
            flowerbed[flowerbed.length-2] = 1;
            flag++;
        } else{
            for(int i=1;i<flowerbed.length-1;i++){
                if(flowerbed[i] == 0 && (flowerbed[i-1] ==0 && flowerbed[i+1]==0)){
                    flowerbed[i] = 1;
                    flag++;
                }
            }
        }
        return flag>=n;
    }
    public static void main(String[] args) {
        //System.out.println(canPlaceFlowers(new int[]{1,0,0,0,0,1},2));
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1},1));

    }
}

public class LC605 {
    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        int[] nums1= {0};
        int n=1;
        boolean num=canPlaceFlowers(nums1,n);
        System.out.print(num);
    }
}

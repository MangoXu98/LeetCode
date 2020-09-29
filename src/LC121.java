public class LC121 {
    static int maxProfit(int[] prices) {
        /*方法一：暴力循环法
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int num=prices[j]-prices[i];
                if(num>max){
                    max=num;
                }
            }
        }
        return max;*/
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums1= {7,1,5,3,6,4};
        int n=maxProfit(nums1);
        System.out.print(n);
    }
}

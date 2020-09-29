public class LC122 {
    static int maxProfit(int[] prices) {
        int max=0;
        for(int i=1;i<prices.length;i++){
            int tmp=prices[i]-prices[i-1];
            if(tmp>0){
                max+=tmp;
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

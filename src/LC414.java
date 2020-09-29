public class LC414 {
    static int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2&&nums[i]<max1){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3&&nums[i]<max2){
                max3=nums[i];
            }
        }
        return (max3==Long.MIN_VALUE||max3==max2)?(int)max1:(int)max3;
    }

    public static void main(String[] args) {
        int[] nums1= {1,1,1};
        int num=thirdMax(nums1);
        System.out.print(num);
    }
}

public class LC283 {
    static int[] moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k++]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1= {0,1,0,3,12};
        int[] num=moveZeroes(nums1);
        System.out.print(num);
    }
}

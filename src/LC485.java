public class LC485 {
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else if(nums[i]==0){
                count=0;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums1= {1,0,1,1,0,1};
        int num=findMaxConsecutiveOnes(nums1);
        System.out.print(num);
    }
}


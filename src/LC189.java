public class LC189 {
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            int tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
    }
    static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1= {-1};
        int k=2;
        int[] nm=rotate(nums1,k);
        for(int n:nm){
            System.out.print(n+" ");
        }
    }
}

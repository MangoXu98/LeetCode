import java.util.Arrays;

public class LC31 {
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    static int[] nextPermutation(int[] nums) {
        int len=nums.length;
        int i=len-1;
        int index=-1;
        while(i>0){
            if(nums[i-1]<nums[i]){
                index=i-1;
                break;
            }
            i--;
        }
        if(index==-1){
            reverse(nums,0);
        }else {
            for (int j = len - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    swap(nums, index, j);
                    break;
                }
            }
            reverse(nums,index+1);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {2,3,1};
//        int val=3;
        int [] res=nextPermutation(nums);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]);
        }
    }
}

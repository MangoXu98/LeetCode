import java.util.Arrays;

public class LC561 {
    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1= {1,4,3,2,6,5};
//        int n=4;
        int num=arrayPairSum(nums1);
        System.out.print(num);
    }
}

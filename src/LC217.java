import java.util.Arrays;

public class LC217 {
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1= {1,1,1,3,3,4,3,2,4,2};
        boolean num=containsDuplicate(nums1);
        System.out.print(num);
    }
}

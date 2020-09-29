import java.util.HashMap;
import java.util.HashSet;

public class LC268 {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hash.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(!hash.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1= {9,6,4,2,3,5,7,0,1};
        int num=missingNumber(nums1);
        System.out.print(num);
    }
}

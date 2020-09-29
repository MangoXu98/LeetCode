import java.util.Arrays;

public class LC532 {
    static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int rt=0,lf=nums.length-1;
        int count=0;
        while(rt<lf){
            int dis=nums[lf]-nums[rt];
            if(dis==k){
                count++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums1= {3, 1, 4, 1, 5};
        int k=2;
        int num=findPairs(nums1,k);
        System.out.print(num);
    }
}

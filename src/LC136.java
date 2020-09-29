
public class LC136 {
    static int singleNumber(int[] nums) {
        int res=0;
        //超强！！学习
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums= {1,0,1};
        System.out.println(singleNumber(nums));
    }
}

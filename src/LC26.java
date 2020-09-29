public class LC26 {
    static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return ++i;
    }
    public static void main(String[] args) {
        int[] nums= {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}

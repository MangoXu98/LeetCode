public class LC169 {
    static int majorityElement(int[] nums) {
        int maxk=0;
        int base=0;
        for(int num:nums){
            if(maxk==0){base=num;}
            maxk+=base==num?1:-1;
        }
        return base;
    }

    public static void main(String[] args) {
        int[] nums1= {2,2,1,1,1,2,2};
        int n=majorityElement(nums1);
        System.out.print(n);
    }
}

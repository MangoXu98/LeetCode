import java.util.HashSet;

public class LC219 {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet hashSet=new HashSet();
        for (int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
            if(hashSet.size()>k){
                hashSet.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1= {1,0,1,1};
        int k=1;
        boolean num=containsNearbyDuplicate(nums1,k);
        System.out.print(num);
    }
}

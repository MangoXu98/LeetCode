import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0||i>0&&nums[i]!=nums[i-1]){// -4 -1 -1 0 1 2
                int l=i+1,r=nums.length-1;
                while(l<r){
                    int sum=nums[i]+nums[l]+nums[r];
                    if(sum==0){//当sum==0时，增加数据
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l<r&&nums[l]==nums[l+1]){
                            l++;}//去重
                        while(l<r&&nums[r]==nums[r-1]){
                            r--;}//去重
                        l++;r--;
                    }else if(sum>0){//当sun>0时，减小右边大的数
                        while(l<r&&nums[r]==nums[r-1]){
                            r--;}
                        r--;
                    }else{//当sun<0时，增大左边小的数
                        while(l<r&&nums[l]==nums[l+1]){
                            l++;}
                        l++;
                    }
            }
        }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums= {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}

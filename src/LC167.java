public class LC167 {
    static int[] twoSum(int[] numbers, int target) {
        /*方法一:暴力改进法
        int[] res=new int[2];
        for(int i=numbers.length-1;i>= 0;i--){
            if(target>=numbers[i]){
                for(int j=0;j<numbers.length;j++){
                    if(numbers[i]+numbers[j]==target){
                        res[0]=i<j?i+1:j+1;
                        res[1]=i>j?i+1:j+1;
                    }
                }
            }
        }
        return res;*/
        int[] res=new int[2];
        int rt=0,lf=numbers.length-1;
        while(rt<lf){
            int tmp=numbers[rt]+numbers[lf];
            if(tmp==target){
                res[0]=rt+1;res[1]=lf+1;
                break;
            }
            if(tmp<target){
                rt++;
            }
            if(tmp>target){
                lf--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1= {2, 7, 11, 15};
        int n=9;
        int[] num=twoSum(nums1,n);
        System.out.print(num[0]+" "+num[1]);
    }
}

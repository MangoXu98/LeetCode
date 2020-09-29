public class LC70 {
    static int climb(int n,int res){
        if(n==0){
            res+=1;
            return res;
        }
        if(n<0){
            return res;
        }
        res=climb(n-1,res);
        res=climb(n-2,res);
        return res;
    }
    static int climbStairs(int n) {
        int res=0;
        res=climb(n,res);
        return res;
    }

    public static void main(String[] args) {
//        int[] nums= {1,0,1};
//        String a="1010";
        int x=44;
        System.out.println(climbStairs(x));
    }
}

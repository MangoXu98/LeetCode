public class LC509 {
    static int fib(int N) {
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        return fib(N-1)+fib(N-2);
    }
    public static void main(String[] args) {
//        int[] nums1= {1,0,1,1,0,1};
        int n=4;
        int num=fib(n);
        System.out.print(num);
    }
}

public class LC202 {
    static boolean isHappy(int n) {
        int num=0;
        while(num!=1) {
            num=0;
            while (n > 0) {
                int yu = n % 10;
                n = n / 10;
                num += yu * yu;
            }
            if (num == 1) {
                return true;
            }else{
                n=num;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n=0;
        boolean num=isHappy(n);
        System.out.print(num);
    }
}

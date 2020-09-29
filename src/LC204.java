public class LC204 {
    static boolean isPrimes(int s){
        if(s<2){return false;}
        for(int i=2;i<=Math.sqrt(s);i++){
            if(s%i==0){
               return false;
            }
        }
        return true;
    }

    static int countPrimes(int n) {
        int count=0;
        if(n<2){
            return count;
        }
        for(int i=2;i<n;i++){
            if(isPrimes(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int ops=10;
        int num=countPrimes(ops);
        System.out.print(num);
    }
}

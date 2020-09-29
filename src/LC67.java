public class LC67 {
    static String addBinary(String a, String b) {
        int lena=a.length(),lenb=b.length();
        int i=lena-1,j=lenb-1;
        StringBuilder res=new StringBuilder();
        int ca=0;
        while(i>-1||j>-1){
            int aa=i>-1?a.charAt(i)-'0':0;
            int bb=j>-1?b.charAt(j)-'0':0;
            int sum=aa+bb+ca;
            res.append(sum%2);
            ca=sum/2;
            i--;j--;
        }
        if(ca==1){
            res.append(ca);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
//        int[] nums= {1,0,1};
        String a="1010";
        String b="1011";
        System.out.println(addBinary(a,b));
    }
}

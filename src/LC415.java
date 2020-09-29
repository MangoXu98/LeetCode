public class LC415 {
    static String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1;
        int ca=0;
        while(i>=0||j>=0){
            int a=i>=0?num1.charAt(i)-'0':0;
            int b=j>=0?num2.charAt(j)-'0':0;
            int num=a+b+ca;
            ca=num/10;int y=num%10;
            res.append(y);
            i--;j--;
        }
        if(ca==1){res.append(ca);}
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String num1="17";
        String num2="116";
        String num=addStrings(num1,num2);
        System.out.print(num);
    }
}

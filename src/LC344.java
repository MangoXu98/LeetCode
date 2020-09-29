public class LC344 {
    static char[] reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
            i++;j--;
        }
        return s;
    }
    public static void main(String[] args) {
//        String s="race a car";
        char[] s={'H'};
        char[] num=reverseString(s);
        System.out.print(num);
    }
}

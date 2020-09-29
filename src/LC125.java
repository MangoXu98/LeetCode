public class LC125 {
    static boolean isPalindrome(String s) {
        StringBuilder tmp=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                tmp.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int len=tmp.length();
        for(int i=0;i<len/2;i++){
            if(tmp.charAt(i)!=tmp.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="race a car";
        boolean num=isPalindrome(s);
        System.out.print(num);
    }
}

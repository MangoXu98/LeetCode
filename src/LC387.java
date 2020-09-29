import java.util.HashMap;

public class LC387 {
    static int firstUniqChar(String s) {
        HashMap hashMap=new HashMap();
        for(int i=0;i<s.length();i++){
            hashMap.put(i,s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            hashMap.remove(i);
            if(i>=1) {
                hashMap.put(i - 1, s.charAt(i - 1));
            }
            if(!hashMap.containsValue(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="l";
        int num=firstUniqChar(s);
        System.out.print(num);
    }
}

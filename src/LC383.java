import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class LC383 {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap hashMap=new HashMap();
        for(int i=0;i<magazine.length();i++){
            hashMap.put(i,magazine.charAt(i));
        }
        for(int i=0;i<ransomNote.length();i++){
            if(hashMap.containsValue(ransomNote.charAt(i))){
                Collection<String> col = hashMap.values();
                col.remove(ransomNote.charAt(i));
                int len=hashMap.size();
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";
//        char[] s={'H'};
        boolean num=canConstruct(ransomNote,magazine);
        System.out.print(num);
    }
}

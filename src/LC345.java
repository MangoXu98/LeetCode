import java.util.HashSet;

public class LC345 {
    static String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        HashSet hash=new HashSet();
        hash.add('a');hash.add('o');hash.add('i');hash.add('e');hash.add('u');
        hash.add('A');hash.add('E');hash.add('I');hash.add('O');hash.add('U');
        char[] ss=s.toCharArray();
        while(i<j){
            if(hash.contains(ss[i])&&hash.contains(ss[j])){
                char tmp=ss[i];
                ss[i]=ss[j];
                ss[j]=tmp;
                i++;j--;
            }else if(!hash.contains(ss[i])){
                i++;
            }else if(!hash.contains(ss[j])){
                j--;
            }
        }
        return String.valueOf(ss);
    }

    public static void main(String[] args) {
        String s="leetcode";
//        char[] s={'H'};
        String num=reverseVowels(s);
        System.out.print(num);
    }
}

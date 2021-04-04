import java.util.Stack;

public class LC844 {
    static boolean backspaceCompare(String S, String T) {
        Stack SS=new Stack();
        Stack ST=new Stack();
        int i=-1,j=-1;
        while(i<S.length()-1){
            i++;
            if(S.charAt(i)=='#'){
                if(SS.isEmpty()){continue;}
                else{SS.pop();}
            }else {
                SS.push(S.charAt(i));
            }
        }
        while (j<T.length()-1){
            j++;
            if(T.charAt(j)=='#'){
                if(ST.isEmpty()){continue;}
                else{ST.pop();}
            }else {
                ST.push(T.charAt(j));
            }
        }
        while(!SS.isEmpty()&&!ST.isEmpty()){
            if(SS.pop()!=ST.pop()){
                return false;
            }
        }
        if(!SS.isEmpty()||!ST.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String ops="a#c";
        String T="bc";
        boolean num=backspaceCompare(ops,T);
        System.out.print(num);
    }
}

public class LC434 {
    static int countSegments(String s) {
        int count=0;
        boolean last=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&last==true){
                if(last==true){
                    count++;
                }
                last=false;
            }else if(s.charAt(i)==' '){
                last=true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="  ";
        int num=countSegments(s);
        System.out.print(num);
    }
}

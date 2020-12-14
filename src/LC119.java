import java.util.ArrayList;
import java.util.List;

public class LC119 {
    static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<Integer>();
        long k=1;
        for(int i=0;i<=rowIndex;i++){
            list.add((int)k);
            k=k*(rowIndex-i)/(i+1);
        }
        return list;
    }
    public static void main(String[] args) {
        int n=5;
        getRow(n);
        for(int i=0;i<n;i++){
            System.out.print(i);
        }
    }
}

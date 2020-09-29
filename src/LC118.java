import java.util.ArrayList;
import java.util.List;

public class LC118 {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        List<Integer> l=new ArrayList<>();
        l.add(1);
        res.add(l);
        for(int i=1;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
            List<Integer> prev=res.get(i-1);
            ll.add(1);
            for(int j=1;j<i;j++){
                ll.add(prev.get(j-1)+prev.get(j));
            }
            ll.add(1);
            res.add(ll);
        }
        return res;
    }

    public static void main(String[] args) {
        int n=5;
        generate(n);
        for(int i=0;i<n;i++){
            System.out.print(i);
        }
    }
}

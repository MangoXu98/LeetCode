import java.util.ArrayList;
import java.util.List;

public class LC107 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();


        return res;
    }
    public static void isSymmetric(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        List<List<Integer>> num=levelOrderBottom(treeNode);
        System.out.print(num);
    }
}

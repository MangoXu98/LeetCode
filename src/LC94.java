import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LC94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    static void middle(TreeNode root,List<Integer> res){
        if(root!=null){
            if(root.left!=null){
                middle(root.left,res);
            }
            res.add(root.val);
            if(root.right!=null){
                middle(root.right,res);
            }
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        middle(root,ll);
        return ll;
    }

    public static void main(String[] args) {


    }
}

public class LC101 {
    static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

     static boolean symmetry(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){return true;}
        if(t1==null||t2==null){return false;}
        return (t1.val==t2.val)&&symmetry(t1.left,t2.right)
                &&symmetry(t1.right,t2.left);
     }
    static boolean isSymmetric(TreeNode root) {
         return symmetry(root,root);
    }

    public static void isSymmetric(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        boolean num=isSymmetric(treeNode);
        System.out.print(num);
    }
}

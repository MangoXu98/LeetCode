public class LC100 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left.val=2;p.right.val=3;
        TreeNode q=new TreeNode(1);
        q.left.val=2;q.right.val=3;
        boolean num=isSameTree(p,q);
        System.out.print(num);
    }
}

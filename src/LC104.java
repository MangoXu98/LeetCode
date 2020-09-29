public class LC104 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int lf=maxDepth(root.left);
            int rt=maxDepth(root.right);
            return Math.max(lf,rt)+1;
        }
    }
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left.val=2;p.right.val=3;
        int num=maxDepth(p);
        System.out.print(num);
    }
}

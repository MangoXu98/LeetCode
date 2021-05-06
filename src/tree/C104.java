package tree;

public class C104 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.right.left = new TreeNode(15);
//		root.right.right = new TreeNode(7);
		Solution_1 solution = new Solution_1();
		int res = solution.maxDepth(root);
		System.out.println(res);
	}

	/**
	 * 104. 二叉树的最大深度
	 * 
	 * 
	 */
	static class Solution_1 {

		public int maxDepth(TreeNode root) {
			if (root == null) {
				return 0;
			}
			 
			int lf = 1 + maxDepth(root.left);
			int rt = 1 + maxDepth(root.right);
			return Math.max(lf, rt); 
		} 
	} 
}

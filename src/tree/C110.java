package tree;

public class C110 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(4); 
		Solution_1 solution = new Solution_1();
		System.out.println(solution.isBalanced(root));
	}

	/**
	 * 一定要先想清楚整个过程应该怎么做，想清楚什么时候做什么才写
	 *
	 */
	static class Solution_1 {
		public boolean isBalanced(TreeNode root) {
			return recur(root)!=-1;
		}

		public int recur(TreeNode node) {
			if (node == null) {
				return 0;
			}
			int leftH = recur(node.left); 
			int rightH = recur(node.right);
			if(leftH==-1||rightH==-1||Math.abs(leftH-rightH)>1) {
				return -1;
			} 
			return Math.max(leftH, rightH)+1; 
		}
	}

}

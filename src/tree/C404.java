package tree;

/**
 * 404. 左叶子之和
 * 
 * 计算给定二叉树的所有左叶子之和。
 */
public class C404 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(10);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		Solution_1 solution = new Solution_1();
		System.out.println(solution.sumOfLeftLeaves(root));
	}

	/** 递归 */
	static class Solution_1 {
		public int sumOfLeftLeaves(TreeNode root) {
			int sum = sumofLeft(root, 0, 1);
			return sum;
		}

		public int sumofLeft(TreeNode node, int sum, int flag) {
			if (node == null) {
				return 0;
			}
			if (node.left == null && node.right == null && flag == 0) {
				return sum + node.val;
			}
			return sumofLeft(node.left, sum, 0) + sumofLeft(node.right, sum, 1);
		}
	}
}

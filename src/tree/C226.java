package tree;

public class C226 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(4);
		p.left = new TreeNode(2);
		p.right = new TreeNode(7);
		p.left.left = new TreeNode(1);
		p.left.right = new TreeNode(3);
		p.right.left = new TreeNode(6);
		p.right.right = new TreeNode(9);
		Solution_1 solution = new Solution_1();
		System.out.println(solution.invertTree(p));
	}

	/** 递归 */
	static class Solution_1 {
		public TreeNode invertTree(TreeNode root) {
			if (root == null) {
				return root;
			}
			root.left = invertTree(root.left);
			root.right = invertTree(root.right);
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			return root;
		}

		/**
		 * 优化代码1 不使用中间变量存储值
		 */
		public TreeNode invertTree_1(TreeNode root) {
			if (root == null) {
				return root;
			}
			TreeNode left = invertTree_1(root.left);
			TreeNode right = invertTree_1(root.right);
			root.left = right;
			root.right = left;
			return root;
		}

		/**
		 * 优化代码2 在递归过程中直接调换顺序
		 */
		public TreeNode invertTree_2(TreeNode root) {
			if (root == null) {
				return root;
			}
			TreeNode temp = root.right;
			root.left = invertTree_2(root.right);
			root.right = invertTree_2(temp);
			return root;
		}
	}
}

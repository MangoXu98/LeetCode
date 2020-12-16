package tree;

public class C111 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(2); 
		p.right = new TreeNode(3); 
		p.right.right = new TreeNode(4);
		p.right.right.right = new TreeNode(5);
		p.right.right.right.right = new TreeNode(6);
		Solution_1 solution = new Solution_1();
		System.out.println(solution.minDepth(p));
	}

	/**
	 * һ��Ҫ���������İ������������������Ϊ��
	 * ������ݹ�Ľ�������
	 *
	 */
	static class Solution_1 {
		public int minDepth(TreeNode root) { 
			return recur(root);
		}

		public int recur(TreeNode node) {
			if (node == null) {
				return 0;
			}
			if (node.left==null) {
				return 1+recur(node.right);
			}
			if (node.right==null) {
				return 1+recur(node.left);
			}
			int left = recur(node.left);
			int right = recur(node.right);
			return Math.min(left, right) + 1; 
		}

	}
}

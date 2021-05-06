package tree;

public class C101 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.right = new TreeNode(4);
		p.right.left = new TreeNode(4);
		p.right.right = new TreeNode(3);
		Solution_1 solution = new Solution_1();
		System.out.println(solution.isSymmetric(p));
	}

	static class Solution_1 {
		public boolean isSymmetric(TreeNode root) {
			return symmetry(root, root);
		}

		public boolean symmetry(TreeNode t1, TreeNode t2) {
			if (t1 == null && t2 == null) {
				return true;
			}
			if (t1 == null || t2 == null) {
				return false;
			}
			return (t1.val == t2.val) && symmetry(t1.left, t2.right) && symmetry(t1.right, t2.left);
		}
	}
}

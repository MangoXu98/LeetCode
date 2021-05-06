package tree;

public class C112 {
	public static void main(String[] args) {
//		TreeNode p = new TreeNode(5);
//		p.left = new TreeNode(4);
//		p.right = new TreeNode(8);
//		p.left.left = new TreeNode(11);
//		p.left.left.left = new TreeNode(7);
//		p.left.left.right = new TreeNode(2);
//		p.right.left = new TreeNode(13);
//		p.right.right = new TreeNode(4);
//		p.right.right.right = new TreeNode(1);
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2); 
		int sum = 1;
		Solution_1 solution = new Solution_1();
		System.out.println(solution.hasPathSum(p, sum));
	}

	static class Solution_1 {
		public boolean hasPathSum(TreeNode root, int sum) { 
			return pathSum(root, sum, 0);

		}

		public boolean pathSum(TreeNode node, int sum, int path) { 
			if(node == null) {
				return false;
			}
			path += node.val;
			if (node.left == null && node.right ==null) {
				if (sum == path) {
					return true;
				} else {
					return false;
				}
			} 
			boolean bl = pathSum(node.left, sum, path);
			boolean br = pathSum(node.right, sum, path);
			return bl || br;
		}
	}

}

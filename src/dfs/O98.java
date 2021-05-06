package dfs;

public class O98 {
	public static void main(String[] args) { 
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(2,left,right);
		Solution_1 solution = new Solution_1();
		boolean res = solution.isValidBST(root);
		System.out.println(res);
	}

	/**
	 * 98. ÑéÖ¤¶þ²æËÑË÷Ê÷
	 * 
	 * 
	 */
	static class Solution_1 {
		public boolean isValidBST(TreeNode root) {  
			return recur(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		
		public boolean recur(TreeNode root, int ma, int mi) {
			if (root == null) {
				return true;
			}

			if (ma <= root.val || root.val <= mi) {
				return false;
			} 

			return recur(root.left, root.val, mi) && recur(root.right, ma, root.val);
		}
	}
}

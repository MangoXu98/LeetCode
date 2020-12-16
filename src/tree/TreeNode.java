package tree;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode createTree(int[] nodeVals) {
		TreeNode root = new TreeNode(1);
		return root; 
	}
}

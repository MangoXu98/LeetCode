     package tree;

//public class TreeNode {

//	int val;
//	TreeNode left;
//	TreeNode right;
//
//	TreeNode(int x) {
//		val = x;
//	}
//	
//	public static TreeNode createTree(int[] nodeVals) {
//		TreeNode root = new TreeNode(1);
//		return root; 
//	}
//}

/**
 * 平衡二叉树
 * 
 * 使用的题目：C110\C111
 * 
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class O7 {
	public static void main(String[] args) {
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };
		Solution_1 solution = new Solution_1();
		TreeNode root = solution.buildTree(preorder, inorder);
		System.out.println(root);
	}

	/**
	 * 方法： 前序遍历：中间节点|左边节点|右边节点 中序遍历：左边节点|中间节点|右边节点
	 * 
	 * 
	 */
	static class Solution_1 {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			int n = inorder.length;
			if (n == 0) {
				return null;
			}
			TreeNode root = new TreeNode(preorder[0]);
			ArrayList<Integer> inList = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				inList.add(inorder[i]);
			}
			int loc = inList.indexOf(preorder[0]);
			root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + loc), Arrays.copyOfRange(inorder, 0, loc));
			root.right = buildTree(Arrays.copyOfRange(preorder, 1 + loc, n), Arrays.copyOfRange(inorder, loc + 1, n));
			return root;
		}
	}

}

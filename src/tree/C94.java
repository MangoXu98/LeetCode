package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class C94 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.right = new TreeNode(6);
		Solution_2 solution = new Solution_2();
		List<Integer> res = solution.inorderTraversal(root);
		System.out.println(res.toString());
	}

	/**
	 * 94. 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�:锟斤拷锟斤拷锟斤拷 锟斤拷锟斤拷锟斤拷 1. 锟捷癸拷 DFS 2. 锟斤拷锟斤拷
	 * 
	 * 
	 */
	static class Solution_1 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> inorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			inorderTraversal(root.left);
			res.add(root.val);
			inorderTraversal(root.right);
			return res;
		}
	}

	static class Solution_2 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> inorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			Stack<TreeNode> stack = new Stack<>();
			while (!stack.isEmpty() || root != null) {
				while (root != null) {
					stack.add(root);
					root = root.left;
				}

				TreeNode cur = stack.pop();
				res.add(cur.val);
				root = cur.right;

			}

			return res;
		}
	}
}

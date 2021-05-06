package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class C145 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.right = new TreeNode(6);
		Solution_3 solution = new Solution_3();
		List<Integer> res = solution.postorderTraversal(root);
		System.out.println(res.toString());
	}

	/**
	 * 145. 二叉树的后序遍历:左右中 方法： 1. 递归 DFS 2. 迭代 
	 * 
	 * 
	 */
	static class Solution_1 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> postorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			postorderTraversal(root.left);
			postorderTraversal(root.right);
			res.add(root.val);
			return res;
		}
	}

	// 对于前序遍历的方式，中左右-中右左-（翻转）-左右中，思路很清晰！！
	static class Solution_2 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> postorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()) {
				TreeNode node = stack.pop();
				res.add(node.val);

				if (node.right != null) {
					stack.push(node.right);
				}

				if (node.left != null) {
					stack.push(node.left);
				}
			}

			Collections.reverse(res);
			return res;
		}
	}

	static class Solution_3 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> postorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			Stack<TreeNode> stack = new Stack<>();
			TreeNode prev = null;
			while (root != null || !stack.isEmpty()) {
				while (root != null) {
					stack.add(root);
					root = root.left;
				}

				root = stack.pop();
				if (root.right == null || root.right == prev) {
					res.add(root.val);
					prev = root;
					root = null;
				} else {
					stack.push(root);
					root = root.right;
				}
			} 
			return res;
		}
	}
}

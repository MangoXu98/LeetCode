package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class C144 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.left.left = new TreeNode(2);
		Solution_2 solution = new Solution_2();
		List<Integer> res = solution.preorderTraversal(root);
		System.out.println(res.toString());
	}

	/**
	 * 144. 二叉树的前序遍历：中左右 方法： 1. 递归 DFS 2. 迭代 
	 * 
	 * 
	 */
	static class Solution_1 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> preorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			res.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			return res;
		}
	}

	static class Solution_2 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> preorderTraversal(TreeNode root) {
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
			return res;
		}
	}

	static class Solution_3 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> preorderTraversal(TreeNode root) {
			if (root == null) {
				return res;
			}

			Stack<TreeNode> stack = new Stack<>();
			while (!stack.isEmpty() || root != null) {
				while (root != null) {
					res.add(root.val);
					stack.push(root);
					root = root.left;
				}

				TreeNode cur = stack.pop();
				root = cur.right;
			}
			return res;
		}
	}
}

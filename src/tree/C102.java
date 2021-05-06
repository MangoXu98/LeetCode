package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C102 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		 root.right = new TreeNode(20);
		 root.right.left = new TreeNode(15);
		 root.right.right = new TreeNode(7);
		Solution_2 solution = new Solution_2();
		List<List<Integer>> res = solution.levelOrder(root);
		System.out.println(res.toString());
	}

	/**
	 * 102. 二叉树的层序遍历
	 * 
	 * 除1，2解法，还可以采用DFS，记录层数，每次得到list相应层数得list再add到之后
	 */

	// BFS: 采用null隔开每一层的节点
	static class Solution_1 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> levelOrder(TreeNode root) {
			if (root == null) {
				return res;
			}

			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			queue.add(null);
			while (!queue.isEmpty()) {
				TreeNode node = queue.poll();

				if (node == null) {
					if (queue.size() != 0) {
						queue.add(null);
					}
					res.add(new ArrayList<>(tmp));
					tmp.clear();
				}

				if (node != null) {
					tmp.add(node.val);

					if (node.left != null) {
						queue.add(node.left);
					}

					if (node.right != null) {
						queue.add(node.right);
					}
				}
			}

			return res;
		}
	}

	// BFS: 记录当前层的节点数，很灵活的先记录当前层数节点的size进行for循环遍历
	static class Solution_2 {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();

		public List<List<Integer>> levelOrder(TreeNode root) {
			if (root == null) {
				return res;
			}

			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);

			while (!queue.isEmpty()) {
				int curSize = queue.size();  
				for (int i = 0; i < curSize; i++) {  //注意采用固定的size，而不是变化的queue.size()
					TreeNode node = queue.poll();

					tmp.add(node.val);
					if (node.left != null) {
						queue.add(node.left);
					}
					if (node.right != null) {
						queue.add(node.right);
					}
				}

				res.add(new ArrayList<>(tmp));
				tmp.clear();
			}
			return res;

		}
	}
	
}

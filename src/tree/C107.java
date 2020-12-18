package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tree.TreeNode;

public class C107 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.right.left = new TreeNode(15);
		p.right.right = new TreeNode(7);

		// solution_1 solution = new solution_1();
		solution_2 solution = new solution_2();
		List<List<Integer>> res = solution.levelOrderBottom(p);
		for (List<Integer> subRes : res) {
			System.out.println(subRes.toString());
		}
	}

	/**
	 * 用递归的方法先递归左边，再递归右边
	 *
	 */

	static class solution_1 {
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			List<List<Integer>> res = new ArrayList<>();
			func(res, 0, root);

			for (int i = 0, j = res.size() - 1; i < j; i++, j--) {
				List<Integer> temp = res.get(i);
				res.set(i, res.get(j));
				res.set(j, temp);
			}

			return res;
		}

		public void func(List<List<Integer>> res, int level, TreeNode root) {

			if (root == null) {
				return;
			}
			if (res.size() == level) {
				List<Integer> subRes = new ArrayList<>();
				subRes.add(root.val);
				res.add(subRes);
			} else {
				res.get(level).add(root.val);
			}
			func(res, level + 1, root.left);
			func(res, level + 1, root.right);
		}
	}

	/**
	 * 用queue存储当前处理到的节点，慢慢将queue弹出来
	 *
	 */

	static class solution_2 {
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			List<List<Integer>> res = new ArrayList<>();
			if (root == null) {
				return res;
			}
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);

			while (!queue.isEmpty()) {
				List<Integer> level = new ArrayList<>();
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.poll(); 
					level.add(node.val);
					TreeNode left = node.left, right = node.right;
					if (left != null) {
						queue.offer(left);
					}
					if (right != null) {
						queue.offer(right);
					}
				}
				res.add(0, level);
			}
			return res;
		}
	}

}

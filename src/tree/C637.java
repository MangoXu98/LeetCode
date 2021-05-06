package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C637 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.left.right = new TreeNode(15);
		p.right.right = new TreeNode(7); 
		solution_1 solution = new solution_1();
		List<Double> res = solution.averageOfLevels(p);
		System.out.println(res.toString());
	}

	/**
	 * 637. 二叉树的层平均值
	 *
	 */

	static class solution_1 {
		List<Double> res = new ArrayList<Double>();
		
		public List<Double> averageOfLevels(TreeNode root) {
			if (root == null) {
				return res;
			}

			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int curSize = queue.size();
				Double levelSum = 0.0;

				for (int i = 0; i < curSize; i++) {
					TreeNode node = queue.poll();

					if (node.left != null) {
						queue.add(node.left);
					}

					if (node.right != null) {
						queue.add(node.right);
					}

					levelSum += node.val;
				}

				Double avg = (double) (levelSum / curSize);
				res.add(avg);
			}

			return res;
		}
	} 
}

package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C559 {
	public static void main(String[] args) {
		Node t1 = new Node(5);
		Node t2 = new Node(6);
		List<Node> childT = new ArrayList<>();
		childT.add(t1);
		childT.add(t2);
		Node l1 = new Node(3, childT);
		Node l2 = new Node(2);
		Node l3 = new Node(4);
		List<Node> childL = new ArrayList<>();
		childL.add(l1);
		childL.add(l2);
		childL.add(l3);
		Node root = new Node(1, childL);
		solution_2 solution = new solution_2();
		int res = solution.maxDepth(root);
		System.out.println(res);
	}

	/**
	 * 559. N 叉树的最大深度
	 *
	 */

	static class solution_1 {
		int depth = 0;

		public int maxDepth(Node root) {
			if (root == null) {
				return depth;
			}

			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int curSize = queue.size();
				depth += 1;
				for (int i = 0; i < curSize; i++) {
					Node node = queue.poll();

					List<Node> children = node.children;
					if (children != null) {
						for (Node n : children) {
							queue.add(n);
						}
					}
				}
			}

			return depth;
		}
	}

	static class solution_2 {
		public int maxDepth(Node root) {
			if (root == null) {
				return 0;
			} 

			int max = 0;
			List<Node> children = root.children;
			if (children != null) {
				for (Node n : children) {
					max = Math.max(max, maxDepth(n));
				}
			}

			return 1 + max;
		}
	}
}

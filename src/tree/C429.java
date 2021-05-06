package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C429 {
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
		solution_1 solution = new solution_1();
		List<List<Integer>> res = solution.levelOrder(root);
		System.out.println(res.toString());
	}

	/**
	 * 429. N ²æÊ÷µÄ²ãÐò±éÀú
	 *
	 */

	static class solution_1 {
		List<List<Integer>> res = new ArrayList<>();

		public List<List<Integer>> levelOrder(Node root) {
			if (root == null) {
				return res;
			}

			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int curSize = queue.size();
				List<Integer> tmp = new ArrayList<>();

				for (int i = 0; i < curSize; i++) {
					Node node = queue.poll();
					tmp.add(node.val);

					List<Node> children = node.children;
					if (children != null) {
						for (Node n : children) {
							queue.add(n);
						}
					}
				}

				res.add(tmp);
			}
			return res;
		}
	}
}

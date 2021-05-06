package tree;

import java.util.LinkedList;
import java.util.Queue;

public class C116 {
	static class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	}

	public static void main(String[] args) {
		Node t1 = new Node(4);
		Node t2 = new Node(5);
		Node l1 = new Node(2, t1, t2, null);
		Node t3 = new Node(6);
		Node t4 = new Node(7);
		Node l2 = new Node(3, t3, t4, null);
		Node root = new Node(1, l1, l2, null);

		solution_1 solution = new solution_1();
		Node res = solution.connect(root);
		System.out.println(res.toString());
	}

	/**
	 * 116. 填充每个节点的下一个右侧节点指针：完美二叉树
	 * 117. 填充每个节点的下一个右侧节点指针 II：二叉树
	 *
	 */

	static class solution_1 {

		public Node connect(Node root) {
			if (root == null) {
				return root;
			}

			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			Node preNode = null;
			while (!queue.isEmpty()) {
				int curSize = queue.size();
				for (int i = 0; i < curSize; i++) {
					Node node = queue.poll();
					if(i==0) {
						preNode = node;
					}
					else {
						preNode.next=node;
						preNode=preNode.next;
					}

					if (node.left != null) {
						queue.add(node.left);
					}

					if (node.right != null) {
						queue.add(node.right);
					}
				}
				preNode.next=null; 
			} 
			return root;
		}
	}
}

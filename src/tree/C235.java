package tree;


/**
 * 235. 二叉搜索树的最近公共祖先
 * 
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 
 */
public class C235 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);

		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(4);

		Solution_1 solution = new Solution_1();
		System.out.println(solution.lowestCommonAncestor(root, p, q));
	}

	/** 递归 */
	static class Solution_1 {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			if (root.val == p.val) {
				return p;
			}
			if (root.val == q.val) {
				return q;
			}
			if (root.val > p.val && root.val > q.val) {
				return lowestCommonAncestor(root.left, p, q);
			} else if (root.val < p.val && root.val < q.val) {
				return lowestCommonAncestor(root.right, p, q);
			} else {
				return root;
	 		}
		}

		// public void path(TreeNode root, TreeNode target, LinkedList<TreeNode> queue)
		// {
		// LinkedList<TreeNode> b_queue = new LinkedList<TreeNode>();
		//
		// b_queue.offer(root);
		// while (!b_queue.isEmpty()) {
		// TreeNode node = b_queue.poll();
		// queue.add(node);
		// if (node.val == target.val) {
		// return;
		// }
		// if(node.left!=null) {
		//
		// b_queue.offer(node.left);
		// }
		// if(node.right!=null) {
		// queue.add(node);
		// b_queue.offer(node.right);
		// }
		// }
		// }
	}
}

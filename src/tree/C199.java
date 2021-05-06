package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
public class C199 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
//		p.right = new TreeNode(3);
//		p.left.right = new TreeNode(5);
//		p.right.right = new TreeNode(4);

		solution_1 solution = new solution_1();
		List<Integer> res = solution.rightSideView(p);
		System.out.println(res.toString());
	}

	/**
	 * 199. ¶þ²æÊ÷µÄÓÒÊÓÍ¼
	 *
	 */

	static class solution_1 {
		List<Integer> res = new ArrayList<Integer>();

		public List<Integer> rightSideView(TreeNode root) {
			if (root==null) {
				return res;
			}
			
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);

			while (!queue.isEmpty()) {

				int curSize = queue.size();

				for (int i = 0; i < curSize; i++) {
					TreeNode node = queue.poll();

					if (i == curSize - 1) {
						res.add(node.val);
					}

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
}

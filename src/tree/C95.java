package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * 
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 */
public class C95 {
	public static void main(String[] args) {
		int n = 3;
		Solution_1 solution = new Solution_1();
		List<TreeNode> res = solution.generateTrees(n);
		for (TreeNode i : res) {
			System.out.println(i);
		}
	}

	/** 递归 */
	static class Solution_1 {
		public List<TreeNode> generateTrees(int n) {
			if (n == 0) {
				return new ArrayList<TreeNode>();
			}
			return generateTree(1, n);
		}

		public List<TreeNode> generateTree(int start, int end) {
			List<TreeNode> allTrees = new ArrayList<TreeNode>();
			if (start > end) {
				allTrees.add(null);
				return allTrees; 
			}

			for (int i = start; i <= end; i++) {
				List<TreeNode> node_l = generateTree(start, i - 1);
				List<TreeNode> node_r = generateTree(i + 1, end);
				for (TreeNode ll : node_l) {
					for (TreeNode rr : node_r) {
						TreeNode cur = new TreeNode(i);
						cur.left = ll;
						cur.right = rr;
						allTrees.add(cur);
					}
				} 
			}
			return allTrees;
		}
	}
}

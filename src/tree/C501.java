package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**TODO 待优化
 * 501. 二叉搜索树中的众数 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * 
 * 假定 BST 有如下定义：
 * 
 * 结点左子树中所含结点的值小于等于当前结点的值 结点右子树中所含结点的值大于等于当前结点的值 左子树和右子树都是二叉搜索树
 */

public class C501 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(2);

		Solution_1 solution = new Solution_1();
		int [] res= solution.findMode(root);
		for(int i:res) {
			System.out.println(i);
		} 
	}

	/** 未考虑BST的情况*/
	static class Solution_1 {
		public int[] findMode(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			Map<Integer, Integer> map = new HashMap<>();
			allNode(root, map);

			Collection<Integer> count = map.values();
			int max = 0;
			for (Integer c : count) {
				max = Math.max(max, c);
			}

			for (Integer key : map.keySet()) {
				if (map.get(key).equals(max)) {
					ll.add(key);
				}
			}
			int[] res = new int[ll.size()];
			for (int i =0;i<ll.size();i++) {
				res[i]=ll.get(i);
			}
			return res;
		}

		public void allNode(TreeNode node, Map<Integer, Integer> map) {
			if (node == null) {
				return;
			}

			if (map.containsKey(node.val)) {
				map.put(node.val, map.get(node.val) + 1);
			} else {
				map.put(node.val, 1);
			}

			allNode(node.left, map);
			allNode(node.right, map);
		}
	}
	
	
//	static class Solution_2 {
//		public int[] findMode(TreeNode root) {
//			
//		}
}

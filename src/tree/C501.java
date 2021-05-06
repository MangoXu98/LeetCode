package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**TODO ���Ż�
 * 501. �����������е����� ����һ������ֵͬ�Ķ�����������BST�����ҳ� BST �е���������������Ƶ����ߵ�Ԫ�أ���
 * 
 * �ٶ� BST �����¶��壺
 * 
 * �������������������ֵС�ڵ��ڵ�ǰ����ֵ �������������������ֵ���ڵ��ڵ�ǰ����ֵ �����������������Ƕ���������
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

	/** δ����BST�����*/
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

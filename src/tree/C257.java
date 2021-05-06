package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. ������������·��
 * 
 * ����һ�����������������дӸ��ڵ㵽Ҷ�ӽڵ��·����
 * 
 * ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 */

public class C257 {
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

		Solution_1 solution = new Solution_1();
		System.out.println(solution.binaryTreePaths(root));
	}

	/** �ݹ� */
	static class Solution_1 {
		public List<String> binaryTreePaths(TreeNode root) {
			List<String> path = new ArrayList<String>();
			pathSum(root, path, "");
			return path;
		}

		public void pathSum(TreeNode node, List<String> path, String s) {
			if(node==null) {
				return;
			}
			s += node.val;
			if (node.left == null && node.right == null) {
				path.add(s.toString());
				return;
			}
			if (node.left != null && node.right == null) {
				pathSum(node.left, path, s + "->");
			} else if (node.right != null && node.left == null) {
				pathSum(node.right, path, s + "->");
			} else {
				String str1 = s;
				pathSum(node.left, path, s + "->");
				pathSum(node.right, path, str1 + "->");
			}
		}
	}
}

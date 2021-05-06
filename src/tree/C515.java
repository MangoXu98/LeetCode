package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C515 {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.left.right = new TreeNode(15);
		p.right.right = new TreeNode(7); 
		solution_1 solution = new solution_1();
		List<Integer> res = solution.largestValues(p);
		System.out.println(res.toString());
	}

	/**
	 * 515. 在每个树行中找最大值
	 *
	 */

	static class solution_1 {
		List<Integer> res = new ArrayList<Integer>();
		
	    public List<Integer> largestValues(TreeNode root) {
	    	if(root==null) {
	    		return res;
	    	}
	    	
	    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    	queue.add(root);
	    	while(!queue.isEmpty()){
	    		int curSize = queue.size();
	    		int max=0;
	    		
	    		for(int i=0;i<curSize;i++) {
	    			TreeNode node = queue.poll();
	    			
	    			if(node.left!=null) {
	    				queue.add(node.left);
	    			}
	    			if(node.right!=null) {
	    				queue.add(node.right);
	    			}
	    			
	    			max = Math.max(max, node.val);
	    		}
	    		res.add(max);
	    	}
			return res;
	        
	    }
	}

}

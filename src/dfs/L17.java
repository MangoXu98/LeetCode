package dfs;

import java.util.ArrayList;
import java.util.HashMap; 
import java.util.List;
import java.util.Map; 

public class L17 {
	public static void main(String[] args) {
		String digits = "23";
		Solution_1 solution = new Solution_1();
		List<String> res1 = solution.letterCombinations(digits);
		System.out.println(res1.toString());
		Solution_2 solution2 = new Solution_2();
		List<String> res2 = solution2.letterCombinations(digits);
		System.out.println(res2.toString());
	}

	/**
	 * 17. 电话号码的字母组合 方法：1.回溯（DFS); 2.BFS 找出所有组合这种问题注意使用递归
	 * 
	 */
	static class Solution_1 {
		public List<String> letterCombinations(String digits) {
			List<String> res = new ArrayList<String>();
			if(digits.length()==0) {
				return res;
			}
			Map<Character, String> map = new HashMap<Character, String>() {
				private static final long serialVersionUID = 1L;
				{
					put('2', "abc");
					put('3', "def");
					put('4', "ghi");
					put('5', "jkl");
					put('6', "mno");
					put('7', "pqrs");
					put('8', "tuv");
					put('9', "wxyz");
				}
			};

			recur(digits, map, res, "");
			return res;
		}

		public void recur(String digits, Map<Character, String> map, List<String> res, String zh) {
			if (digits.length() == 0) {
				res.add(zh);
				return;
			}

			String zm = map.get(digits.charAt(0));

			for (int i = 0; i < zm.length(); i++) {
				recur(digits.substring(1), map, res, zh + zm.charAt(i));
			}
		}
	}

	/**
	 * 方法2
	 * 
	 */

	static class Solution_2 {
		public List<String> letterCombinations(String digits) {  
			List<String> res = new ArrayList<>();
			if(digits.length()==0) {
				return res;
			}
			Map<Character, String> map = new HashMap<Character, String>() {
				private static final long serialVersionUID = 1L;
				{
					put('2', "abc");
					put('3', "def");
					put('4', "ghi");
					put('5', "jkl");
					put('6', "mno");
					put('7', "pqrs");
					put('8', "tuv");
					put('9', "wxyz");
				}
			};

			res.add("");
			for (int i = 0; i < digits.length(); i++) {
				String dy = map.get(digits.charAt(i));
				int size = res.size();
				for(int j=0;j<size;j++) {
					String old = res.remove(0); 
					for (int k = 0; k < dy.length(); k++) {
						res.add(old+dy.charAt(k)); 
					} 
				}
			} 
			return res;
		}
	}

}

package hash;

import java.util.HashMap;

public class C205 {
	public static void main(String[] args) {
		String s = "badc";
		String t = "baba";
		Solution_2 solution = new Solution_2();
		System.out.println(solution.isIsomorphic(s, t));
	}

	/** 
	 * 不在乎顺序(跟题目偏差)
	 */
	static class Solution_1 {
		public boolean isIsomorphic(String s, String t) {
			HashMap<Character, Integer> map_s = store(s);
			HashMap<Character, Integer> map_t = store(t);
			if (map_s.size() != map_t.size()) {
				return false;
			}  
			 
			for(Integer v :map_s.values()) {
				if(!map_t.containsValue(v)) {
					return false;
				}
			} 
			return true;
		}

		public HashMap<Character, Integer> store(String s) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < s.length(); i++) {
				if (!map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), 1);
				} else {
					int num = map.get(s.charAt(i)) + 1;
					map.put(s.charAt(i), num);
				}
			}
			return map;
		}
	}
	
	static class Solution_2 {
		public boolean isIsomorphic(String s, String t) {
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			for (int i = 0; i < s.length(); i++) {
				if (!map.containsKey(s.charAt(i))) {
					if(map.containsValue(t.charAt(i))) {
						return false;
					}
					map.put(s.charAt(i), t.charAt(i));
				} else {
					if (map.get(s.charAt(i))!=t.charAt(i)) {
						return false;
					}
				}
			}
			return true;
		} 
	}
}

package random;

import java.util.HashMap;
import java.util.Map;


/**
 * 直接具有对应关系的可以采用HashMap去存储对应的关系
 * 学习到map具有的函数：不仅可以判断有没Key,还可以判断有无value
 *
 */

public class C290 {
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		Solution_1 solution = new Solution_1();
		System.out.println(solution.wordPattern(pattern, s));
	}

	static class Solution_1 {
		public boolean wordPattern(String pattern, String s) {
			Map<Character, String> match = new HashMap<>();
			String[] str = s.split(" ");
			int pNum = pattern.length();
			int sNum = str.length;
			if (pNum != sNum) {
				return false;
			}
			for (int i = 0; i < pNum; i++) {
				if (!match.containsKey(pattern.charAt(i))) {
					if(match.containsValue(str[i])) {
						return false;
					}
					match.put(pattern.charAt(i), str[i]);
				} else {
					if (!match.get(pattern.charAt(i)).equals(str[i])) {
						return false;
					} 
				} 
			} 
			return true; 
		}
	}

}

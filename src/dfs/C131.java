package dfs;

import java.util.ArrayList;
import java.util.List;

public class C131 {
	public static void main(String[] args) {
		String s = "aabbb";
		Solution_1 solution = new Solution_1();
		List<List<String>> res = solution.partition(s);
		System.out.println(res.toString());
	}

	/**
	 * 131. ·Ö¸î»ØÎÄ´®
	 * 
	 * 
	 */
	static class Solution_1 {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> tmp = new ArrayList<>();

		public List<List<String>> partition(String s) {
			backTracking(s);
			return res;
		}

		public void backTracking(String s) {
			if (s.length() == 0) {
				if (isHw(tmp)) {
					res.add(new ArrayList<>(tmp));
				}
				return;
			}

			for (int i = 1; i < s.length() + 1; i++) {
				String cur = s.substring(0, i);
				tmp.add(cur);
				String rem = s.substring(i);
				backTracking(rem);
				s = cur.concat(rem);
				tmp.remove(tmp.size() - 1);
			}
		}

		public boolean isHw(List<String> tmp) {
			for (int i = 0; i < tmp.size(); i++) {
				if (!isHw_s(tmp.get(i))) {
					return false;
				}
			}
			return true;
		}

		public boolean isHw_s(String s_tmp) {
			boolean flag = true;
			int lr = s_tmp.length() - 1;
			int lf = 0;
			while (lf <= lr) {
				if (s_tmp.charAt(lf) != s_tmp.charAt(lr)) {
					flag = false;
					break;
				}
				lf++;
				lr--;
			}
			return flag;
		}
	}
}

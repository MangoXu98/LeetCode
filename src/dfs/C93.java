package dfs;

import java.util.ArrayList;
import java.util.List;

public class C93 {
	public static void main(String[] args) {
		String s = "25525511135";
//		String s = "0000";
		Solution_1 solution = new Solution_1();
		List<String> res = solution.restoreIpAddresses(s);
		System.out.println(res.toString());
	}

	/**
	 * 93. ∏¥‘≠ IP µÿ÷∑
	 * 
	 * 
	 */
	static class Solution_1 {
		List<String> res = new ArrayList<String>();

		public List<String> restoreIpAddresses(String s) {
			if (s.length() < 4 || s.length() > 12) {
				return res;
			}
			backTracking(s, new ArrayList<>(), 0);
			return res;
		}

		public void backTracking(String s, List<String> IP_path, int seg_num) {
			if (seg_num == 4) {
				if (s.length() == 0) {
					res.add(String.join(".", IP_path));
				}
				return;
			}

			for (int i = 1; i <= 3; i++) {
				if (s.length() >= i) {
					String cur = s.substring(0, i);
					int cur_i = Integer.parseInt(cur);

					if (cur_i > 255 || (cur.length() > 1 && cur.charAt(0) == '0')) {
						continue;
					}

					IP_path.add(cur);
					backTracking(s.substring(i), IP_path, seg_num + 1);
					IP_path.remove(IP_path.size() - 1);
				}
			}
		}
	}

}

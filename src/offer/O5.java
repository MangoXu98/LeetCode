package offer;

public class O5 {
	public static void main(String[] args) {
		String s = "We are happy.";
		Solution_1 solution = new Solution_1();
		System.out.println(solution.replaceSpace(s));
	}

	/**
	 * 方法： 1. 字符数组遍历 2. String转换为List,在利用StringBuilder进行append
	 * 
	 */
	static class Solution_1 {
		public String replaceSpace(String s) {
			return s.replace(" ", "%20");
		}
	}
}

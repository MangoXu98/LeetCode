package offer;

public class O5 {
	public static void main(String[] args) {
		String s = "We are happy.";
		Solution_1 solution = new Solution_1();
		System.out.println(solution.replaceSpace(s));
	}

	/**
	 * ������ 1. �ַ�������� 2. Stringת��ΪList,������StringBuilder����append
	 * 
	 */
	static class Solution_1 {
		public String replaceSpace(String s) {
			return s.replace(" ", "%20");
		}
	}
}

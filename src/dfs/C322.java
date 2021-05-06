package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class C322 {
	public static void main(String[] args) {
		List<List<String>> tickets = new ArrayList<>();
		// tickets.add(new ArrayList<>(Arrays.asList("MUC", "LHR")));
		// tickets.add(new ArrayList<>(Arrays.asList("JFK", "MUC")));
		// tickets.add(new ArrayList<>(Arrays.asList("SFO", "SJC")));
		// tickets.add(new ArrayList<>(Arrays.asList("LHR", "SFO")));
		tickets.add(new ArrayList<>(Arrays.asList("JFK", "SFO")));
		tickets.add(new ArrayList<>(Arrays.asList("JFK", "ATL")));
		tickets.add(new ArrayList<>(Arrays.asList("SFO", "ATL")));
		tickets.add(new ArrayList<>(Arrays.asList("ATL", "JFK")));
		tickets.add(new ArrayList<>(Arrays.asList("ATL", "SFO")));
		Solution_1 solution = new Solution_1();
		List<String> res = solution.findItinerary(tickets);
		System.out.println(res.toString());
	}

	/**
	 * 332. 重新安排行程
	 * 
	 * 
	 */
	static class Solution_1 {
		List<String> res = new ArrayList<>();

		public List<String> findItinerary(List<List<String>> tickets) {
			HashMap<String, List<String>> fromTo = new HashMap<>();
			for (int i = 0; i < tickets.size(); i++) {
				String src = tickets.get(i).get(0), dst = tickets.get(i).get(1);
				if (!fromTo.containsKey(src)) {
					fromTo.put(src, new ArrayList<String>());
				}
				fromTo.get(src).add(dst);
			}

			fromTo.values().forEach(x -> x.sort(String::compareTo));
			backTracing(fromTo, "JFK");
			return res;
		}

		public void backTracing(HashMap<String, List<String>> fromTo, String start) {
			List<String> dsts = fromTo.get(start);

			while (dsts != null && dsts.size() > 0) {
				backTracing(fromTo, dsts.remove(0));
			}

			res.add(0, start);
		}
	}
}

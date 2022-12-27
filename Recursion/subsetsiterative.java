import java.util.*;
public class Main {
	public static void main(String[] args) {
		//iteration
		int[] ar = {1, 2, 3};
		ArrayList<List<Integer>> ans = iter(ar);
		for (List<Integer> x : ans) {
			System.out.println(x);
		}
	}
	static ArrayList<List<Integer>> iter(int[] arr) {
		ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
		ans.add(new ArrayList<Integer>());
		for (int x : arr) {
			if (ans.contains(new ArrayList<Integer>()))
				int n = ans.size();
			for (int i = 0; i < n; i++) {
				ArrayList<Integer> in = new ArrayList<Integer>(ans.get(i));
				in.add(x);
				if (ans.contains(in) == false)	ans.add(in);
			}
		}
		return ans;
	}
}
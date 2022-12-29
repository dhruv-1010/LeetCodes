import java.util.*;
public class Main {
	public static void main(String[] args) {
		//	int[] ar = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] ar = {2, 2, 1, 3};
		HashSet<List<Integer>> nee = new HashSet<List<Integer>>();
		int target = 6;
		rec(nee, ar, new ArrayList<Integer>(), target, 0);
		ArrayList<List<Integer>> nee2 = new ArrayList<List<Integer>>(nee);
		System.out.println(nee2);
	}
	static void rec(HashSet<List<Integer>> nee, int[] ar, ArrayList<Integer> in, int target, int si) {
		if (target < 0) return;
		if (target == 0) {
			ArrayList<Integer> mid = new ArrayList<Integer>(in);
			nee.add(mid);
			return;
		}
		for (int i = si; i < ar.length; i++) {
			if (i > si && ar[i] == ar[i - 1]) continue;
			in.add(ar[i]);
			//rec(nee,ar,in,target-ar[i],si);
			rec(nee, ar, in, target - ar[i], i + 1);
			in.remove(in.size() - 1);
		}
	}
}
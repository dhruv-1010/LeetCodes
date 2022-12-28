import java.util.*;
public class Main {
	public static void main(String[] args) {
		int ar[] = {1, 1, 3};

		ArrayList<List<Integer>> nee = new ArrayList<List<Integer>>();
		rec(nee, ar, 0);
		System.out.println(nee);
	}
//	static void rec()
	static void rec(ArrayList<List<Integer>> nee, int[] ar, int si) {
		if (si == ar.length) {
			ArrayList<Integer> mid = new ArrayList<Integer>();
			for (int x : ar) {
				mid.add(x);
			}
			if (!nee.contains(mid))nee.add(mid);
			return;
		}
		for (int i = si; i < ar.length; i++) {
			swap(ar, i, si);
			rec(nee, ar, si + 1);
			swap(ar, i, si);

		}
	}
	public static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
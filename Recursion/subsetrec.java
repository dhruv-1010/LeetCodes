import java.util.*;
public class Main {
	public static void main(String[] args) {
		int ar[] = {0};
		ArrayList<List<Integer>> nee = new ArrayList<List<Integer>>();
		rec(nee, ar, new ArrayList<Integer>(), 0);
		System.out.println(nee);
	}

	static void rec(ArrayList<List<Integer>> nee, int[] ar, ArrayList<Integer> in, int si) {
		if (si == ar.length) {
			nee.add(new ArrayList<Integer>(in));
			return ;
		}
		int num = ar[si];
		in.add(num);
		rec(nee, ar, in, si + 1);
		in.remove(in.size() - 1);
		rec(nee, ar, in, si + 1);
	}
}
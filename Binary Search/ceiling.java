import java.util.*;
public class Main {
	static int bceil(int[] ar, int target) {
		int lo = 0;
	int 	hi = ar.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (ar[mid] == target)return mid;
			else if (ar[mid] > target) lo = mid + 1;
			else hi = mid - 1;
		}
		return lo;
	}
	static int ceil(int[] ar, int target) {
		int i;
		for ( i = 0; i < ar.length; i++) {
			if (ar[i] >= target) {
				return i;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		int target = sc.nextInt();
		int ans = ceil(ar, target);
		int answ = bceil(ar, target);
		System.out.println(ans + " " + answ);

	}
}
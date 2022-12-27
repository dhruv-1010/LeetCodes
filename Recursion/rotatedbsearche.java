public class Main {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		System.out.println(rec(arr, 9, 0, arr.length - 1));
	}
	static int rec(int[] arr, int target, int s, int e) {
		if (s > e) return -1;
		int m = s + (e - s) / 2;
		if (arr[m] == target) return m;
		if (arr[s] <= arr[m]) {
			if (target >= arr[s] && target <= arr[m]) {
				return rec(arr, target, s, m - 1);
			} else return rec(arr, target, m + 1, e);
		}
		if (target >= arr[m] && target <= arr[e]) {
			return rec(arr, target, m + 1, e);
		}
		return rec(arr, target, s, m - 1);
	}
}
public class Main {
	public static void main(String[] args) {
		int[] ar = {9};
		System.out.println(is(ar, 0, ar.length - 1));
	}
	static boolean is(int[] ar, int in, int fn) {
		//base
		if (in == fn) {
			return true;
		}
		if (ar[in] > ar[in + 1]) return false;

		return is(ar, in + 1, fn);

	}
}
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String s = sc.next();
		int count = 0;
		boolean[] found = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String sa = s.substring(i, j);
				long num = Long.parseLong(sa);
				if (CbN(num) == true && washere(found, i, j - 1) == true) {
					count++;
					for (int z = i; z <= j - 1; z++) {
						found[z] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	//cb number checker
	public static boolean CbN(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		//condition 1
		int[] ar = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {//returning
				return true;
			}
		}
		//condition 2
		for (int i = 0; i < ar.length; i++) {
			if (num % ar[i] == 0) {
				return false;//returning
			}
		}
		// condition 3
		return true;
	}
// the friend condition
	public static boolean washere(boolean[] found, int i, int j) {//visited index checket
		for (int z = i; z <= j; z++) {
			if (found[z] == true) {//returning
				return false;
			}
		}
		return true;//else
	}

}
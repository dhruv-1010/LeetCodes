import java.util.*;
public class Main {
// isnt very useful when repeated elements are searched
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ar = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int val = sc.nextInt();
				ar[i][j]= val;
			}
		};
		int tr = sc.nextInt();
		int lo = 0;
		int  hi = n - 1;
		boolean flag = false;
		while (lo <= n - 1 && hi >= 0) {
			if (ar[lo][hi] == tr) {
				System.out.println("found at " + (lo + 1) + " ," + (hi + 1)+ " position");
				flag = true;
				break;
			} else if (ar[lo][hi] < tr)	lo++;
			else hi--;
		}
		if (!flag)System.out.println("not found");
	}
}
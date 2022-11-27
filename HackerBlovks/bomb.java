import java.util.*;
public class Main {
	//matrix template
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		//int m = ar[].length; //rows
		int n = sc.nextInt();
		//int n = ar[0].length; //columns
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int val = sc.nextInt();
				if (val == 0) mat[i][j] = -1;
				else mat[i][j] = val;
			}
		}
		solve(mat, m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int val = mat[i][j];
				if (val == -1) mat[i][j] = 0;
			}
		}
		//print
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void solve(int[][] mat, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int val = mat[i][j];
				if (val == -1) bomb(mat, i, j);
			}
		}
	}
	static void bomb(int[][] mat, int i, int j) {
		for (int k = 0; k < mat[0].length; k++) {
			if (mat[i][k] != -1) mat[i][k] = 0;
		}
		for (int k = 0; k < mat.length; k++) {
			if (mat[k][j] != -1) mat[k][j] = 0;
		}
	}
}
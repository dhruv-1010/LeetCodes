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
				mat[i][j] = sc.nextInt();
			}
		}
		// row - col
		int minr = 0, minc = 0, maxr = m - 1, maxc = n - 1;
		int count = 0, lim = m * n;
		while (count < lim) {
			//down
			for (int i = minc; count < lim && i <= maxc; i++) {
				System.out.print(mat[minr][i] + ", ");
				count++;
			}
			minr++;
			//right
			for (int i = minr; count < lim && i <= maxr; i++) {
				System.out.print(mat[i][maxc] + ", ");
				count++;
			}
			maxc--;
			//up
			for (int i = maxc; count < lim && i >= minc; i--) {
				System.out.print(mat[maxr][i] + ", ");
				count++;
			}
			maxr--;
			//left
			for (int i = maxr; count < lim &&
					i >= minr; i--) {
				System.out.print(mat[i][minc] + ", ");
				count++;
			}
			minc++;
		}
		System.out.print("END");
	}
}
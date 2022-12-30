import java.util.*;
public class Main {
	public static void main(String[] args) {
		boolean board[][] = {
			{true, true, true},
			{false, true, true},
			{true, true, true},
		};
		int[][] path = new int[board.length][board[0].length];
		rec("", 0, 0, board, path, 1);
	}
	public static void rec(String up, int m, int n, boolean[][] board, int[][] path, int step) {
		if (m == board.length - 1 && n == board[0].length - 1) {
			path[m][n] = step;
			for (int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(up);
			return;
		}
		//if obstacle is present
		if (!board[m][n]) return;
		//changing for current call
		board[m][n] = false;
		path[m][n] = step;
		if (m < board.length - 1) {
			rec(up + 'D', m + 1, n, board, path, step + 1);
		}
		if (n < board[0].length - 1) {
			rec(up + 'R', m, n + 1, board, path, step + 1);
		}
		if (m > 0) {
			rec(up + 'U', m - 1, n, board, path, step + 1);
		}
		if (n > 0) {
			rec(up + 'L', m, n - 1, board, path, step + 1);
		}
		//backtracking
		//reverting changes made for current call
		board[m][n] = true;
		path[m][n] = 0;
	}
}
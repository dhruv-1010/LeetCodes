import java.util.*;
public class Main {
	static void palto(int ar[], int a, int b) {
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	static void ulta(int[] array, int start, int end) {
		int i = start;
		int j = end;
		while (i < j) {
			palto(array, i, j);
			i++;
			j--;
		}
	}
	public void nextPermutation(int [] ar) {
		int n = ar.length;
		int i = n - 2, j = n - 1;
		for (; i >= 0; i--) {
			if (ar[i] < ar[i + 1]) break;
		}
		if (i < 0) ulta(ar, 0, n - 1);
		else {
			for (; j > i; j--) {
				if (ar[j] > ar[i]) break;
			}
			palto(ar, i, j);
			ulta(ar, i + 1, n - 1);

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int[] ar = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			};
			permit(ar);
			for (int x : ar) {
				System.out.print(x + " ");
			}
		}
	}
}
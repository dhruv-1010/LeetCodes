import java.util.*;
public class Main {
	//main
	static void selectionsort(int[] ar) {
		int n = ar.length;
		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (ar[mini] > ar[j]) {
					mini = j;
				}
			}
			if (mini != i) {
				int temp = ar[i];
				ar[i] = ar[mini];
				ar[mini] = temp;
			}
		}
	}
	//driver
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		selectionsort(ar);
		for (int x : ar) {
			System.out.print(x + " ");
		}
	}
}
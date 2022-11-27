import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != i + 1) {
				int temp = ar[i];
				ar[i] = ar[temp - 1];
				ar[temp - 1] = temp;
			}
		}
		for (int x : ar) {
			System.out.print(x + " ");
		}
	}
}
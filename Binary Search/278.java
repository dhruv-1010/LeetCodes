import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n;++) {
			int val = sc.bextInt();
			ar[i] = val;
		};
		for(int x: ar){
			System.out.print(x+" ");
		}
	}
}
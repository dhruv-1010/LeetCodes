import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int[] br = new int[n];
	    int in =0;
		for(int i = 0;i<n;i++){
			br[ar[i]] = in;
			in++;
		}
		for(int x: br){
			System.out.print(x+" ");
		}
	}
}
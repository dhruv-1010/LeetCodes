import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		boolean[] count = new boolean[ar.length + 1];
		for (int i = 0; i < n; i++) {
			count[ar[i]] = true;
		}
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			if (count[i] == false) ans = i;
		}
	//	return ans; another approach
	   int sum=0,n=ar.length;
	   for(int x: arr){
	   	sum+=x;
	   }
	   return (n*(n-1))/2 - sum;
	}
}
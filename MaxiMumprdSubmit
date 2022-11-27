import java.util.*;
public class Main {
	static int ans(int[] ar) {
		int max = Integer.MIN_VALUE;
		for (int i=0;i<ar.length;i++) {
			int val = ar[i];
			int mid = Math.max(val,max);
			for(int j = i+1;j<ar.length;j++){
				val*=ar[j];
				mid=Math.max(mid,val);
			}
			max = Math.max(max,mid);
			}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		}
		int as = ans(ar);
		System.out.println(as);
	}
}
import java.util.*;
public class Main {
	static int auns(int[] ar) {
		int max= ar[0],min=ar[0],ans=ar[0];
		for (int x : ar) {
					int t = max;
					if(x<0){
						int temp = max;
						max = min;
						min = max;
					}
					max=Math.max(max*x,x);
					min=Math.min(min*x,x);
					ans = Math.max(max,ans);
			}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		}
		int as = auns(ar);
		System.out.println(as);
	}
}
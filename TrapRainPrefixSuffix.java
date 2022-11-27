import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int [] pr = new int[n];
	//	pr[0] = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		pr[0] = ar[0];
		for (int i = 1; i < n; i++) {
			pr[i] = Math.max(pr[i-1],ar[i]);
		}; 
	   int sf[] = new int[n];
		sf[n-1] = ar[n-1];
		for (int i = n-2;
		 i >=0;
		  i--) {
		   sf[i] = Math.max(sf[i+1],ar[i]);
		}; 
		
		int ans =0;
		for(int i =0;i<n-1;i++){
			  ans += Math.min(sf[i],pr[i])-ar[i];
			}
			System.out.println(ans);
	}
}
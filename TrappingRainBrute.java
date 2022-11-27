import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		}
		int ans =0;
		for(int i =0;i<n-1;i++){
			  int cur =ar[i];
			  int lmax=ar[0];
			  int rmax=ar[n-1];
			  for(int j=i;j>=0;j--){
			  	 lmax = Math.max(ar[j],lmax);
			  	}
		//	  System.out.println(lmax);
			  for(int j=i;j<n-1;j++){
			  	 rmax = Math.max(ar[j],rmax);
			  	}
		//	  System.out.println(rmax);
			  ans += Math.min(lmax,rmax)-cur;
			  //System.out.println(ans);
			}
			System.out.println(ans);
	}
}
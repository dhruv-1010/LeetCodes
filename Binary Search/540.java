import java.util.*;
public class Main {
	 static boolean iseven(int a){
	 	return ((a&(a-1))==1)?true:false;
	 }
	static int bsearch(int[] ar,int target){
		int n =ar.length;
		int hi = ar.length-2;
		int lo=0;
		if(hi==0) return ar[hi];
		if(hi==1) return ar[hi];
		while(lo<=hi){
			int mid= lo+(hi-lo)/2;
			if(iseven(mid)){
				if(mid>0 && ar[mid+1] == ar[mid]) hi =mid-1;
				else if(mid+1>n && ar[mid] ==ar[mid-1] lo= mid+1;
				else return ar[mid];
			}else{
				
				if( ar[mid]) l=mid+1;
				else hi=mid;
			}
			
		}
		return ar[lo];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		for (int x : ar) {
			System.out.print(x + " ");
		}
	}
}
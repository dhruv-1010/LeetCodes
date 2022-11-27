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
		int i =0;
		int j = n-1;
		int lmax=0,rmax=0,res=0;
		while(i<j){
			if(ar[i] <= ar[j]){
				if(ar[i]>=lmax) lmax=ar[i];
				else res+= lmax-ar[i];
				i++;
			}else{
					if(ar[j]>=rmax) rmax=ar[j];
				else res+= rmax-ar[j];
				j--;
			}
		}
		System.out.println(res);
		
	}
}
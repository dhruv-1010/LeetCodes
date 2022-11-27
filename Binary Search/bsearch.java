import java.util.*;
public class Main {
 // isnt very useful when repeated elements are searched
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] ar = new int[n];
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				ar[i] = val;
			};
			int tr = sc.nextInt();
			int lo=0;
			int  hi = n -1;
			boolean flag = false;
			while(lo<=hi){
				int mid =lo+(hi-lo)/2;
			
				if(ar[mid]==tr){ return mid;
			}
				else if(ar[mid]<tr)
					lo=mid+1;
				else hi=mid-1;
			}
			if(!flag)System.out.println("not found");
	}
		// as the size of int is fixed mid value can exceed the Integer.Max so we need to optimise this condition bettter way is to take mid = (hi +2*lo -lo)/2== lo +(hi-lo)/2
}
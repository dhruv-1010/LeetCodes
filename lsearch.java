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
			int tr = sc.nextInt();
			int lo=0;
			
			boolean flag = false;
			while(lo<n){
				if(ar[lo]==tr){
					 System.out.println("found at "+(lo+1)+"th index");
					 flag = true;
					 break;
					 }
					 lo++;
			}
			if(!flag)System.out.println("not found");
	}
}
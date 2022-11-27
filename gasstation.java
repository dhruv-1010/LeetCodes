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
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				arr[i] = val;
			};
			int cur=0,max=0,start=0;
			for(int i=0;i<n;i++){
				cur += ar[i]-arr[i];
				max += ar[i]-arr[i];
				if(cur<0){
					cur=0;
					start=i+1;
				}
			}
			
			if(max<0){
				System.out.println(-1);
			}else{
				System.out.println(start);
			}
		//	for(int x: ar){
//			System.out.print(x+" ");
//			}
	}
}
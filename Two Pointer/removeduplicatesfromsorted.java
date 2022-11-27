import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		int i =0;
		int j = 0;
		while(i<n){
			if(ar[i] != ar[j]){
				j++;
				ar[j] = ar[i];
				}
			i++;
		}
		
		for( i=0;i<=j;i++){
			int x = ar[i];
			System.out.print(
			x+" ");
		}
	}
}
import java.util.*;
public class Main {
     static void reverse(int[] ar,int i,int j){
     	while(i<j){
     			int tem = ar[i];
     			ar[i] = ar[j];
     			ar[j] = tem;
     			i++;
     			j--;
     		}	
     	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		int k = sc.nextInt();
		reverse(ar,0,n-1);
		reverse(ar,0,k-1);
		reverse(ar,k,n-1);
		for(int x: ar){
			System.out.print(x+" ");
			}
	}
}
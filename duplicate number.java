import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int dupli(int [] ar){
		int n = ar.length;
		for(int i=0;i<n;){
			if(ar[i]==(i+1)) i++;
			else if(ar[i] == ar[ar[i]-1]) return ar[i];
			else{
				int temp = ar[ar[i]-1];
				ar[ar[i]-1] = ar[i];
				ar[i] = temp;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		int val = dupli(ar);
		System.out.println(val);
	}
}
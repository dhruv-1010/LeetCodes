import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int zc=0,oc=0,tc=0;
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(val==0) zc++;
			else if(val==1) oc++;
			else tc++;
		}
		int in=0;
		while(zc-->0){
			ar[in] = 0;
			in++;
			}
			while(oc-->0){
			ar[in] = 1;
			in++;
			}
		while(tc-->0){
			ar[in] = 2;
			in++;
			}
		for(int x:ar){
			System.out.print(x +" ");
		}
	}
}
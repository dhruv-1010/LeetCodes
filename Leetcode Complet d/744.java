import java.util.*;
public class Main {
	static char cha(char[] ar, char tr) {
		if (tr > ar[ar.length - 1]) return ar[0];
		int lo = 0;
		int  hi = ar.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (ar[mid] > tr)
				hi= mid - 1;
			else lo=mid+1;
		}
		return ar[lo%ar.length];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ar = new char[n];
		for (int i = 0; i < n; i++) {
			char val = sc.next().charAt(0);
			ar[i] = val;
		};
		char tar = sc.next().charAt(0);
		char ans = cha(ar, tar);
		//for(int x: arr){
		System.out.println(ans + " ");
//	   }
	}
}
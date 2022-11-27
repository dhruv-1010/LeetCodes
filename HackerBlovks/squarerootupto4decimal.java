import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testc=sc.nextInt();
		while(testc-->0){
			double eps = 1e-7;
			double n= sc.nextLong();
			double hi = n;
			double lo = 1;
			double ans =0;
			
			while(hi - lo> eps){
				double mid = lo +(hi-lo)/2;
				if(mid*mid<n) lo=mid;
				else hi = mid;
				ans = lo;
				}
		//	ans = Math.round(ans*10000)/10000.0;
		String num = String.format("%.5f", ans);
// this is actually gold XD
num = num.substring(0, num.length() - 1);
		    System.out.println(num);
		}
	}
}
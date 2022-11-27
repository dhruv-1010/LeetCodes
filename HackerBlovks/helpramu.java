import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
			//input begin
			int c1=sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			//input end intilaizing min costs
			int rmin  = 0;
			int cmin =0;
			int rfmin =0;
			int cfmin =0;
			//rickshaw
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				rmin += Math.min(c1*val,c2);
			}
			rfmin = Math.min(rmin,c3);
			//cab
			for (int i = 0; i < m; i++) {
				int val = sc.nextInt();
				cmin += Math.min(c1*val,c2);
			}
			cfmin = Math.min(cmin,c3);
			//final
			int finalans = Math.min(cfmin+rfmin,c4);
			System.out.println(finalans);
		}
	}
}
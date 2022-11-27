import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
			int n = sc.nextInt();
			int[] ar = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			Arrays.sort(ar);
			int mindif = Integer.MAX_VALUE;
			int min_i=0,min_j=0,lo=0,hi=ar.length-1;
			while(lo<hi){
				if(ar[lo] +ar[hi] == target){
					return new int[]{lo+1,hi+1};
				}else if(ar[lo] + ar[hi] < target) lo++;
				else hi--;
			}
			return new int[]{-1,-1};
			System.out.println("Deepak should buy roses whose prices are " + ar[min_i] +" and " + ar[min_j] +".");
		}
	}
}
import java.util.*;
public class Main {
    static int maxs(int[] ar){
    	int maxs = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	int tsum = 0;
    	int tesum =0;
    	int arsum =0;
    	for(int x : ar){
    		arsum+=x;
    		tesum+=x;
    		maxs=Math.max(tesum,maxs);
    		if(tesum <0) tesum =0;
    		tsum +=x;
    		min = Math.min(tsum,min);
    		if(tsum>0) tsum=0;
    	}
    	if(arsum == min) return maxs;
    	return Math.max(maxs,arsum-min);
    }
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] ar = new int[n];
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				ar[i] = val;
			};
	
		   System.out.println(maxs(ar));
	}
}
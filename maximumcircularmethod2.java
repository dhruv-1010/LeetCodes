import java.util.*;
public class Main {
    static int maxs(int[] ar){
    	int maxs = Integer.MIN_VALUE;
    	int tesum =0;
    	int arsum =0;
    	for(int x : ar){
    		x=-1*x;
    		arsum+=x;
    		tesum+=x;
    		maxs=Math.max(tesum,maxs);
    		if(tesum <0) tesum =0;
    
    	}
    	return -1*(arsum-maxs);
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
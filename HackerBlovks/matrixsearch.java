import java.util.*;
public class Main {
	static boolean bsearch2d(int[][] ar,int target){
		int r =0;
		int c= ar[0].length-1;
		while(r<ar.length && c>=0){
			if(ar[r][c]==target) {
				return true;
			}else if(ar[r][c]>target) c--;
			else r++;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] ar = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int val = sc.nextInt();
				ar[i][j] = val;
			}
		}
		int target = sc.nextInt();
        int ans = (bsearch2d(ar,target))?1:0;
       System.out.println(ans);
	}
		}
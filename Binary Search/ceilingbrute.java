import java.util.*;
public class Main {
//logic is shitty you need to work more SEM 3 is going brother what are you doing now its not even cool anymore!
//code was of Ceiling of a number i am fucking up on the final answer the logic is cool but there is a much better approach using binary search. Implement it fast!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int [] br = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar[i] = val;
		};
		int target = sc.nextInt();
		for (int i = 0; i < n; i++) {
			br[i] = ar[i] - target;
		}
		int min=0;
		int ans =Integer.MIN_VALUE;
		for(int x:ar){
			if(x>=0){
				min=Math.min(min,x);
				ans =x;}
		}
		System.out.println(ans);
		for (int x : ar) {
				System.out.print(x + " ");
			}
	}
	//my brute still sucks
	// 7 OCT 2022 8:47
	// i am trying this for over 2 hours now 
	
}
import java.util.*;
public class Main {
	static int minsize(int[] ar,int target){
		int n=ar.length;
		int left=0,right=0;
		int sum = 0;
		int mins=Integer.MAX_VALUE;
		while(right<n){
			sum+=ar[right];
			right++;
			while(sum>=target){
				mins=Math.min(mins,right-left);
				sum-=ar[left++];
			}	
		}
		return mins==Integer.MAX_VALUE?0:mins;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(minsize(ar,target));
		for (int x : ar) {
			System.out.print(x + " ");
		}
	}
}
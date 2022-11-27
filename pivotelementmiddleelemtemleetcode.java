import java.util.*;
public class Main {
	static int pivot(int[] nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int lsum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
			if (lsum == sum) return i;
			lsum += nums[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			nums[i] = val;
		};
		System.out.println(pivot(nums));

	}
}
/*
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) rightSum+=nums[i];
        if (leftSum == rightSum) return 0;

        for(int i = 1; i < nums.length; i++){
            leftSum+= nums[i-1];
            rightSum-= nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}*/
import java.util.*;
public class Main {
	static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
					return new int[] {i, map.get(target - nums[i]);
				 }
			}
			map.put(nums[i], i);
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] mat = twoSum(nums, target);
		for (int x : mat) {
			System.out.print(x + " ");
		}
	}
}
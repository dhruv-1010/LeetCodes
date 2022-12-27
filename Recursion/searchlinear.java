import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] ar = {1, 3, 5, 7, 9, 0, 6,9, 7, 11, 10, 99};
	
		System.out.println(is(ar, 0, ar.length - 1,9,new ArrayList<Integer>()));
	}
	static ArrayList<Integer> is(int[] ar, int in, int fn, int target,ArrayList<Integer> list) {
		//base
		if (in == fn + 1) {
			return list;
		}
		if (ar[in] == target) list.add(in);

		return is(ar, in + 1, fn, target,list);

	}
}
public class Main {
	static int bsearchrec(int [] ar, int target, int lo, int hi) {
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (ar[mid] == target) return mid;
		if (ar[mid] > target) {
			return  bsearchrec(ar, target, lo, mid - 1);
		}
		return bsearchrec(ar,target,mid+1,hi);
	}
	public static void main(String[] args) {
            int[] arr = {1,2,3,444,555,666,7777};
         int   target = 3;
            int lo = 0,hi=arr.length-1;
            System.out.println(bsearchrec(arr,target,lo,hi));
	}
}
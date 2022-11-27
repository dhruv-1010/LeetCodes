import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] ar = new int[n];
			int[] br = new int[m];
			for (int i = 0; i < n; i++) {
				int val  = sc.nextInt();
				ar[i] = val;
			}
			for (int i = 0; i < m; i++) {
				int val = sc.nextInt();
				br[i] = val;
			}
		    int fans = maxSum(ar,br);
			System.out.println(fans);
		}
		
	}
    static int maxSum(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        long ans1 = 0;
        long ans2 = 0;
        long ans = 0;
        while(i!=nums1.length&&j!=nums2.length){
            if(nums1[i]>nums2[j])
              ans2 += nums2[j++];
            else if(nums1[i]<nums2[j])
                ans1 += nums1[i++];
            else{
                ans+=Math.max(ans1,ans2)+nums1[i];
                i++;
                j++;
                ans1=0;
                ans2=0;
            }
        }
        while(i!=nums1.length){
            ans1 += nums1[i];
            i++;
        }
        while(j!=nums2.length){
            ans2 += nums2[j];
            j++;
        }
        ans += Math.max(ans1,ans2);
        return (int)ans;
    }
}
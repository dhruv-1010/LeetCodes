import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = ar.length;
		int prd= 1;
		int cnt=0;
		for (int i = 0; i < n; i++) {

	 	int val= 	ar[i] ;
			if(val!=0 ){ 
			prd*=val;}
			else if(val==0){
				cnt++;
				}
		}
		int i=0;
		for(int x:ar){
			if(cnt>1){
				ar[i] = 0;
				}
			else if(cnt==1){
				if(x!=0) ar[i] = 0;
				else ar[i] = prd;
			}
			else {
				ar[i] = prd/x;
			}
			i++;
		}
		for(int x : ar){
			System.out.print(x+" ");
		}
	}
}
/*
sample 1 ms submission
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];
        int zeros = 0;
        int indexOfZero = -1;
        
        int mult = 1;

        for(int i =0; i<n;i++) {
            if(nums[i]==0) {
                zeros++;
                indexOfZero = i;
                continue;
            }
            mult = mult * nums[i];
        }
       
        if(zeros>1)
            return sol;
        else if(zeros==1)
            sol[indexOfZero] = mult;
        else{
            for(int i = 0;i<n;i++){
                sol[i] = mult/nums[i];
            }
        }
        return sol;
    }
}*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int  n= sc.nextInt();
		 int k = sc.nextInt();
		 int [] arr = new int[n];
		 for(int i = 0;i<n;i++){
		 		arr[i]=sc.nextInt();
		 	}
		 int ei=0,si=0,prd=1,cnt=0;
		 while(ei<arr.length){
		 	prd*=arr[ei];
		 	while(prd>=k && si<=ei){
		 		prd=prd/arr[si];
		 		si++;
		 		}
		 	cnt += ei-si+1;
		 	ei++;
		 	}
		 System.out.println(cnt);
	}
}
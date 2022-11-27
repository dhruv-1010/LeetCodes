import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
	     //int m = ar[].length; //rows
	     int n = sc.nextInt();
	     //int n = ar[0].length; //columns
	     int[][] mat = new int[m][n];
	     for(int i=0;i<m;i++){
	     	for(int j =0;j<n;j++){
	     		mat[i][j] = sc.nextInt();
	     	} 
	     }
	     //
	     for(int i= 0;i<m;i++){
	     	if(i%2==0){
	     		for(int j=0;j<n;j++){
	     			System.out.print(mat[i][j]+", ");
	     		}
	     	}
	     	else{
	     		for(int j=n-1;j>=0;j--){
	     			System.out.print(mat[i][j]+", ");
	     		}
	     	}
	     }
	     System.out.print("END");
	}
}
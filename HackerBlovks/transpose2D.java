import java.util.*;
public class Main {
	//matrix template
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     //int m = ar[].length; //rows
	     int n = sc.nextInt();
	     //int n = ar[0].length; //columns
	     int[][] mat = new int[n][n];
	     for(int i=0;i<n;i++){
	     	for(int j =0;j<n;j++){
	     		mat[i][j] = sc.nextInt();
	     	} 
	     }
	     // transpose;
	     for(int i = 0;i<n;i++){
	     	for(int j=i;j<n;j++){
	     		int temp = mat[i][j];
	     		mat[i][j] = mat[j][i];
	     		mat[j][i] = temp;
	     	} 
	     }
	       //print
	         for(int i=0;i<n;i++){
	     	for(int j =0;j<n;j++){
	     	 System.out.print(mat[i][j]+" ");
	     	} 
	     	System.out.println();
	     }
	}
}
public class Main {
	//matrix template
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
	     //code next
	     
	     
	     
	     //print
	     for(int [] x : mat){
	     	for(int a : x) System.out.print(x+" ");
	     	System.out.println();
	     }
	}
}
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char[][] mat = new char[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = sc.next().charAt(0);
            }
        }
        int mxs = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
         
               if(s<k) mxs=1;
                if(mat[i][j] == '.') s-=2;
                else if(mat[i][j] == '*') s+=5;
                else if(mat[i][j] == '#') break;
          
                if(j!=n-1) s--;
               
            }
        }
        if(s>k && mxs == 0){
        	 System.out.println("Yes");
        	 System.out.println(s);}
        else System.out.println("No");
    }

}
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int vacl = n;
			n=2*(n-1);
			int row = n;
			int col = n;
			int r = 0;
			while(r<=row){
				int c=0;
				while(c<=col){
				int	val =vacl-Math.min(Math.min(r,c),Math.min(n-c,n-r));
					System.out.print(val+" ");
					c++;
				}
				r++;
				System.out.println("");
			}
	}
}
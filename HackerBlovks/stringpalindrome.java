import java.util.*;
public class Main {
	static boolean ispalin(String qs){
		int i = 0;
		int j = qs.length()-1;
		while(i<j){
			if(qs.charAt(i) != qs.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String qs = sc.nextLine();
		boolean ans = ispalin(qs);
		System.out.println(ans);
	}
}
import java.util.*;
public class Main {
	static boolean ispalin(String qs) {
		int i = 0;
		int j = qs.length() - 1;
		while (i < j) {
			if (qs.charAt(i) != qs.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qs = sc.nextLine();
		int countsub = 0;
		for (int i = 0; i < qs.length(); i++) {
			for (int j = i + 1; j < qs.length() + 1; j++) {
				String substr = qs.substring(i, j);
				//	System.out.println(substr);
				if (ispalin(substr) == true) {
					countsub++;
					//System.out.println(substr);
				}
			}
		}
		System.out.println(countsub);
	}
}
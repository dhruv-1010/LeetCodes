import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder nee = new StringBuilder();
		String qs = sc.nextLine();
		if (qs.length() == 0) System.out.println("");
		else {
			int i = 0;
			char fi = qs.charAt(0);
			nee.append(qs.charAt(0));
			while (i < qs.length()) {
				if (qs.charAt(i) != fi) {
					nee.append(qs.charAt(i));
					fi = qs.charAt(i);
				}
				i++;
			}
			System.out.println(nee);
		}
	}
}
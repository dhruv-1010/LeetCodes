import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qs = sc.nextLine();
		if (qs.length() == 1) System.out.println(qs);
		else {
			int Cin = 0;
			for (int i = 1; i < qs.length(); i++) {
				if (qs.charAt(i) >= 'A' && qs.charAt(i) <= 'Z') {
					System.out.println(qs.substring(Cin, i));
					Cin = i;
				}
				if (i == qs.length() - 1) System.out.println(qs.substring(Cin, i + 1));
			}
		}
	}
}
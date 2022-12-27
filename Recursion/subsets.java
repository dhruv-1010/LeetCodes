import java.util.*;
public class Main {
	public static void main(String[] args) {
		rec("aab", "");
		Collections.sort(str);
		System.out.println(str);
		System.out.println(cnt);
	}
	static ArrayList str = new ArrayList<String>();
	static int cnt = 0;
	static void rec(String up, String p) {
		if (up.isEmpty()) {
			str.add(p);
			cnt++;
			return;
		}
		char ch = up.charAt(0);
		rec(up.substring(1), p + ch);
		rec(up.substring(1), p);
	}
}
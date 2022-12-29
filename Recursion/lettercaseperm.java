import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> nee = new ArrayList<String>();
		String s = "A1a";
		rec(nee, s, new ArrayList<Character>(), 0);
		return nee;
	}
	static void rec(ArrayList<String> nee, String s, ArrayList<Character> in, int si) {
		if (in.size() == s.length()) {
			ArrayList<Character> mid = new ArrayList<Character>();
			String a = "";
			for (char x : mid) {
				a += x + "";
			}
			nee.add(x);
			return;
		}
		if (s.charAt(si) >= '0' && s.charAt(si) <= '9') {
			in.add(s.charAt(si));
			rec(nee, s, in, si + 1);
			in.remove(in.size() - 1);
		} else {
			char ch = s.charAt(si);
			in.add(Character.toLowerCase(s.charAt(si)));
			rec(nee, s, in, si + 1);
			in.remove(in.size() - 1);
			in.add(Character.toUpperCase(s.charAt(si)));
			rec(nee, s, in, si + 1);
			in.remove(in.size() - 1);
		}

	}
}
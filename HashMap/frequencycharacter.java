import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String babu=sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < babu.length(); i++) {
			if (map.containsKey(babu.charAt(i))) {
				int count = map.get(babu.charAt(i));
				count++;
				map.put(babu.charAt(i), count);
			}else{
				map.put(babu.charAt(i),1);
			}
		}
		System.out.println(map);
	}
}
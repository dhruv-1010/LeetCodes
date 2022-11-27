import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String babu = sc.nextLine();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < babu.length(); i++) {
			if (map.containsKey(Character.getNumericValue(babu.charAt(i)))) {
				int count = map.get(Character.getNumericValue(babu.charAt(i)));
				count++;
				map.put(Character.getNumericValue(babu.charAt(i)), count);
			} else {
				map.put(Character.getNumericValue(babu.charAt(i)), 1);
			}
		}
		System.out.println(map);
	}
}
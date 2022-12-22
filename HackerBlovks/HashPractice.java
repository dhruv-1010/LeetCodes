import java.util.*;
public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		map.put(4, 5);
		//set of all key,value pair
		System.out.println(map.entrySet());
		//set of all values
		System.out.println(map.values());
		//set of all keys
		System.out.println(map.keySet());
		//Map.Entry<k,v> it = hs.entryset() is a
		// type of iterator
		// it iterates over the hashmap entryset()
		// or enteries works same as auto it:map in c++ really comfortable anywayxD
		for (Map.Entry<Integer, Integer> x : map.entrySet()) {
			if (x.getKey() == 3) System.out.println(x.getValue());
			else System.out.println(x.getValue() + 10);
		}
	}
}
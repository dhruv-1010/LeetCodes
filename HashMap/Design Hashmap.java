public class HashMap() {
	private HashMap<Integer, Integer> map;
	public MyHashMap() {
		map = new HashMap<Integer, Integer>();
	}
	public void put(int key, int value) {
		map.put(key, value);
	}
	public int get(int key) {
		if (!map.containsKey(key)) {
			return -1;
		}
		return map.get(key);
	}
	public void remove(int key) {
		if (map.containsKey(key)) {
			map.remove(key);
		}
	}
}
}
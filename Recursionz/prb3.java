public class Main {
	static void n(int ab){
		if(ab==0) return;
		System.out.println(ab);
		ab--;
		n(ab);
		}
	public static void main(String[] args) {
		int z = 11;
		n(z);
	}
}